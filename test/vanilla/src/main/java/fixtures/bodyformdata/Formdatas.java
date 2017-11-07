/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyformdata.models.ErrorException;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.InputStream;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Formdatas.
 */
public interface Formdatas {
    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    InputStream uploadFile(byte[] fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;InputStream&gt;} object
     */
    ServiceFuture<InputStream> uploadFileAsync(byte[] fileContent, String fileName, final ServiceCallback<InputStream> serviceCallback);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;InputStream&gt;} object if successful.
     */
    Single<InputStream> uploadFileAsync(byte[] fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, InputStream&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, InputStream>> uploadFileWithRestResponseAsync(byte[] fileContent, String fileName);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    InputStream uploadFileViaBody(byte[] fileContent);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;InputStream&gt;} object
     */
    ServiceFuture<InputStream> uploadFileViaBodyAsync(byte[] fileContent, final ServiceCallback<InputStream> serviceCallback);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;InputStream&gt;} object if successful.
     */
    Single<InputStream> uploadFileViaBodyAsync(byte[] fileContent);

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, InputStream&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, InputStream>> uploadFileViaBodyWithRestResponseAsync(byte[] fileContent);

}
