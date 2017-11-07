/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.requiredoptional;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.requiredoptional.models.Error;
import fixtures.requiredoptional.models.ErrorException;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Implicits.
 */
public interface Implicits {
    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredPath(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Error&gt;} object
     */
    ServiceFuture<Error> getRequiredPathAsync(String pathParameter, final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Error&gt;} object if successful.
     */
    Single<Error> getRequiredPathAsync(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> getRequiredPathWithRestResponseAsync(String pathParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalQueryAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalQueryWithRestResponseAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalQuery(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalQueryAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalQueryAsync(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalQueryWithRestResponseAsync(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalHeader();

    /**
     * Test implicitly optional header parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalHeaderAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalHeaderAsync();

    /**
     * Test implicitly optional header parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalHeaderWithRestResponseAsync();

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalHeader(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalHeaderAsync(String queryParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalHeaderAsync(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalHeaderWithRestResponseAsync(String queryParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalBody();

    /**
     * Test implicitly optional body parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalBodyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalBodyAsync();

    /**
     * Test implicitly optional body parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalBodyWithRestResponseAsync();

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putOptionalBody(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putOptionalBodyAsync(String bodyParameter, final ServiceCallback<Void> serviceCallback);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Void&gt;} object if successful.
     */
    Single<Void> putOptionalBodyAsync(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putOptionalBodyWithRestResponseAsync(String bodyParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredGlobalPath();

    /**
     * Test implicitly required path parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Error&gt;} object
     */
    ServiceFuture<Error> getRequiredGlobalPathAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required path parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Error&gt;} object if successful.
     */
    Single<Error> getRequiredGlobalPathAsync();

    /**
     * Test implicitly required path parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> getRequiredGlobalPathWithRestResponseAsync();

    /**
     * Test implicitly required query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getRequiredGlobalQuery();

    /**
     * Test implicitly required query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Error&gt;} object
     */
    ServiceFuture<Error> getRequiredGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly required query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Error&gt;} object if successful.
     */
    Single<Error> getRequiredGlobalQueryAsync();

    /**
     * Test implicitly required query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> getRequiredGlobalQueryWithRestResponseAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Error object if successful.
     */
    Error getOptionalGlobalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Error&gt;} object
     */
    ServiceFuture<Error> getOptionalGlobalQueryAsync(final ServiceCallback<Error> serviceCallback);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Error&gt;} object if successful.
     */
    Single<Error> getOptionalGlobalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> getOptionalGlobalQueryWithRestResponseAsync();

}
