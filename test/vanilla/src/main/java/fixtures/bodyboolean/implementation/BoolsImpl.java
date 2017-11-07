/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import fixtures.bodyboolean.Bools;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyboolean.models.ErrorException;
import io.reactivex.functions.Function;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Bools.
 */
public class BoolsImpl implements Bools {
    /** The RestProxy service to perform REST calls. */
    private BoolsService service;
    /** The service client containing this operation class. */
    private AutoRestBoolTestServiceImpl client;

    /**
     * Initializes an instance of Bools.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BoolsImpl(AutoRestBoolTestServiceImpl client) {
        this.service = RestProxy.create(BoolsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Bools to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface BoolsService {
        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools getTrue" })
        @GET("bool/true")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Boolean>> getTrue();

        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools putTrue" })
        @PUT("bool/true")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putTrue(@BodyParam("application/json; charset=utf-8") boolean boolBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools getFalse" })
        @GET("bool/false")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Boolean>> getFalse();

        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools putFalse" })
        @PUT("bool/false")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putFalse(@BodyParam("application/json; charset=utf-8") boolean boolBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools getNull" })
        @GET("bool/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Boolean>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodyboolean.Bools getInvalid" })
        @GET("bool/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Boolean>> getInvalid();

    }

    /**
     * Get true Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getTrue() {
        return getTrueAsync().blockingGet();
    }

    /**
     * Get true Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getTrueAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getTrueAsync(), serviceCallback);
    }

    /**
     * Get true Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> getTrueWithRestResponseAsync() {
        return service.getTrue();
    }

    /**
     * Get true Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> getTrueAsync() {
        return getTrueWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putTrue(boolean boolBody) {
        putTrueAsync(boolBody).blockingGet();
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putTrueAsync(boolean boolBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putTrueAsync(boolBody), serviceCallback);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putTrueWithRestResponseAsync(boolean boolBody) {
        return service.putTrue(boolBody);
    }

    /**
     * Set Boolean value true.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putTrueAsync(boolean boolBody) {
        return putTrueWithRestResponseAsync(boolBody)
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get false Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getFalse() {
        return getFalseAsync().blockingGet();
    }

    /**
     * Get false Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getFalseAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getFalseAsync(), serviceCallback);
    }

    /**
     * Get false Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> getFalseWithRestResponseAsync() {
        return service.getFalse();
    }

    /**
     * Get false Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> getFalseAsync() {
        return getFalseWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putFalse(boolean boolBody) {
        putFalseAsync(boolBody).blockingGet();
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putFalseAsync(boolean boolBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putFalseAsync(boolBody), serviceCallback);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putFalseWithRestResponseAsync(boolean boolBody) {
        return service.putFalse(boolBody);
    }

    /**
     * Set Boolean value false.
     *
     * @param boolBody the boolean value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putFalseAsync(boolean boolBody) {
        return putFalseWithRestResponseAsync(boolBody)
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get null Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getNullAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> getNullAsync() {
        return getNullWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get invalid Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get invalid Boolean value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getInvalidAsync(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid Boolean value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


}
