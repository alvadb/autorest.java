/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.microsoft.rest.v2.RestResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.azurespecials.ErrorException;
import io.reactivex.functions.Function;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import com.microsoft.azure.v2.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionLocals.
 */
public class ApiVersionLocalsInner {
    /** The RestProxy service to perform REST calls. */
    private ApiVersionLocalsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionLocalsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionLocalsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(ApiVersionLocalsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionLocals to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface ApiVersionLocalsService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getMethodLocalValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/local/2.0")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getMethodLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getMethodLocalNull" })
        @GET("azurespecials/apiVersion/method/string/none/query/local/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getMethodLocalNull(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getPathLocalValid" })
        @GET("azurespecials/apiVersion/path/string/none/query/local/2.0")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getPathLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getSwaggerLocalValid" })
        @GET("azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getSwaggerLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getMethodLocalValid() {
        getMethodLocalValidAsync().blockingGet();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getMethodLocalValidWithRestResponseAsync() {
        final String apiVersion = "2.0";
        return service.getMethodLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getMethodLocalValidAsync() {
        return getMethodLocalValidWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getMethodLocalNull() {
        getMethodLocalNullAsync().blockingGet();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalNullAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getMethodLocalNullWithRestResponseAsync() {
        final String apiVersion = null;
        return service.getMethodLocalNull(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getMethodLocalNullAsync() {
        return getMethodLocalNullWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getMethodLocalNull(String apiVersion) {
        getMethodLocalNullAsync(apiVersion).blockingGet();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalNullAsync(String apiVersion, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalNullAsync(apiVersion), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getMethodLocalNullWithRestResponseAsync(String apiVersion) {
        return service.getMethodLocalNull(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getMethodLocalNullAsync(String apiVersion) {
        return getMethodLocalNullWithRestResponseAsync(apiVersion)
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getPathLocalValid() {
        getPathLocalValidAsync().blockingGet();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getPathLocalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getPathLocalValidWithRestResponseAsync() {
        final String apiVersion = "2.0";
        return service.getPathLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getPathLocalValidAsync() {
        return getPathLocalValidWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getSwaggerLocalValid() {
        getSwaggerLocalValidAsync().blockingGet();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getSwaggerLocalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getSwaggerLocalValidWithRestResponseAsync() {
        final String apiVersion = "2.0";
        return service.getSwaggerLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> getSwaggerLocalValidAsync() {
        return getSwaggerLocalValidWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Void>, Void>() { public Void apply(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


}
