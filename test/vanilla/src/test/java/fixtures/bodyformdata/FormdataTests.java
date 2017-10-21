package fixtures.bodyformdata;

import com.google.common.base.Charsets;
import com.microsoft.rest.RestResponse;
import com.microsoft.rest.http.FileSegment;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

import fixtures.bodyformdata.implementation.AutoRestSwaggerBATFormDataServiceImpl;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

public class FormdataTests {
    private static AutoRestSwaggerBATFormDataService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestSwaggerBATFormDataServiceImpl("http://localhost:3000");
    }

    @Ignore("Multipart form data not currently supported")
    @Test
    public void uploadFileMultipart() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream stream = classLoader.getResourceAsStream("upload.txt");
        byte[] bytes = IOUtils.toByteArray(stream);
        stream.close();
        InputStream result = client.formdatas().uploadFile(bytes, "sample.png");
        try {
            Assert.assertEquals(new String(bytes), IOUtils.toString(result));
        } finally {
            result.close();
        }
    }

    @Test
    public void uploadFileViaBody() throws Exception {
        // FIXME: generate FileRegion overload and pass the resource that way
        ClassLoader classLoader = getClass().getClassLoader();
        URI uri = classLoader.getResource("upload.txt").toURI();
        RandomAccessFile raf = new RandomAccessFile(new File(uri), "r");
        try {
            byte[] actual = client.formdatas().uploadFileViaBodyWithRestResponseAsync(new FileSegment(raf.getChannel(), 0, (int)raf.length()))
                    .map(new Func1<RestResponse<?, InputStream>, byte[]>() {
                        @Override
                        public byte[] call(RestResponse<?, InputStream> inputStreamServiceResponse) {
                            try {
                                return IOUtils.toByteArray(inputStreamServiceResponse.body());
                            } catch (IOException e) {
                                throw Exceptions.propagate(e);
                            }
                        }
                    }).toBlocking().value();

            byte[] expected = new byte[(int)raf.length()];
            raf.readFully(expected);

            Assert.assertEquals(new String(expected, Charsets.UTF_8), new String(actual, Charsets.UTF_8));
        } finally {}
    }
}
