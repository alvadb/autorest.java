/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.UnixTime;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodyinteger.Ints;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined in
 * Ints.
 */
public class IntsImpl implements Ints {
    /**
     * The RestProxy service to perform REST calls.
     */
    private IntsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestIntegerTestServiceImpl client;

    /**
     * Initializes an instance of Ints.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public IntsImpl(AutoRestIntegerTestServiceImpl client) {
        this.service = RestProxy.create(IntsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Ints to be used by RestProxy
     * to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface IntsService {
        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getNull" })
        @GET("int/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Integer>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getInvalid" })
        @GET("int/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Integer>> getInvalid();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getOverflowInt32" })
        @GET("int/overflowint32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Integer>> getOverflowInt32();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getUnderflowInt32" })
        @GET("int/underflowint32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Integer>> getUnderflowInt32();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getOverflowInt64" })
        @GET("int/overflowint64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Long>> getOverflowInt64();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getUnderflowInt64" })
        @GET("int/underflowint64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Long>> getUnderflowInt64();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints putMax32" })
        @PUT("int/max/32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMax32(@BodyParam("application/json; charset=utf-8") int intBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints putMax64" })
        @PUT("int/max/64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMax64(@BodyParam("application/json; charset=utf-8") long intBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints putMin32" })
        @PUT("int/min/32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMin32(@BodyParam("application/json; charset=utf-8") int intBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints putMin64" })
        @PUT("int/min/64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMin64(@BodyParam("application/json; charset=utf-8") long intBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getUnixTime" })
        @GET("int/unixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getUnixTime();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints putUnixTimeDate" })
        @PUT("int/unixtime")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putUnixTimeDate(@BodyParam("application/json; charset=utf-8") long intBody);

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getInvalidUnixTime" })
        @GET("int/invalidunixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getInvalidUnixTime();

        @Headers({ "x-ms-logging-context: fixtures.bodyinteger.Ints getNullUnixTime" })
        @GET("int/nullunixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, DateTime>> getNullUnixTime();

    }

    /**
     * Get null Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the int object if successful.
     */
    public int getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getNullAsync(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<RestResponse<Void, Integer>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<Integer> getNullAsync() {
        return getNullWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Integer>, Integer>() { public Integer call(RestResponse<Void, Integer> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get invalid Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the int object if successful.
     */
    public int getInvalid() {
        return getInvalidAsync().toBlocking().value();
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getInvalidAsync(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<RestResponse<Void, Integer>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid Int value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<Integer> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Integer>, Integer>() { public Integer call(RestResponse<Void, Integer> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get overflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the int object if successful.
     */
    public int getOverflowInt32() {
        return getOverflowInt32Async().toBlocking().value();
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getOverflowInt32Async(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowInt32Async(), serviceCallback);
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<RestResponse<Void, Integer>> getOverflowInt32WithRestResponseAsync() {
        return service.getOverflowInt32();
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<Integer> getOverflowInt32Async() {
        return getOverflowInt32WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Integer>, Integer>() { public Integer call(RestResponse<Void, Integer> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get underflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the int object if successful.
     */
    public int getUnderflowInt32() {
        return getUnderflowInt32Async().toBlocking().value();
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Integer> getUnderflowInt32Async(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowInt32Async(), serviceCallback);
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<RestResponse<Void, Integer>> getUnderflowInt32WithRestResponseAsync() {
        return service.getUnderflowInt32();
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Integer> object
     */
    public Single<Integer> getUnderflowInt32Async() {
        return getUnderflowInt32WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Integer>, Integer>() { public Integer call(RestResponse<Void, Integer> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get overflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the long object if successful.
     */
    public long getOverflowInt64() {
        return getOverflowInt64Async().toBlocking().value();
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Long> getOverflowInt64Async(ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowInt64Async(), serviceCallback);
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Long> object
     */
    public Single<RestResponse<Void, Long>> getOverflowInt64WithRestResponseAsync() {
        return service.getOverflowInt64();
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Long> object
     */
    public Single<Long> getOverflowInt64Async() {
        return getOverflowInt64WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Long>, Long>() { public Long call(RestResponse<Void, Long> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get underflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the long object if successful.
     */
    public long getUnderflowInt64() {
        return getUnderflowInt64Async().toBlocking().value();
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Long> getUnderflowInt64Async(ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowInt64Async(), serviceCallback);
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Long> object
     */
    public Single<RestResponse<Void, Long>> getUnderflowInt64WithRestResponseAsync() {
        return service.getUnderflowInt64();
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Long> object
     */
    public Single<Long> getUnderflowInt64Async() {
        return getUnderflowInt64WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Long>, Long>() { public Long call(RestResponse<Void, Long> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMax32(int intBody) {
        putMax32Async(intBody).toBlocking().value();
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMax32Async(int intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMax32Async(intBody), serviceCallback);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMax32WithRestResponseAsync(int intBody) {
        return service.putMax32(intBody);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putMax32Async(int intBody) {
        return putMax32WithRestResponseAsync(intBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMax64(long intBody) {
        putMax64Async(intBody).toBlocking().value();
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMax64Async(long intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMax64Async(intBody), serviceCallback);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMax64WithRestResponseAsync(long intBody) {
        return service.putMax64(intBody);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putMax64Async(long intBody) {
        return putMax64WithRestResponseAsync(intBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMin32(int intBody) {
        putMin32Async(intBody).toBlocking().value();
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMin32Async(int intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMin32Async(intBody), serviceCallback);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMin32WithRestResponseAsync(int intBody) {
        return service.putMin32(intBody);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putMin32Async(int intBody) {
        return putMin32WithRestResponseAsync(intBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMin64(long intBody) {
        putMin64Async(intBody).toBlocking().value();
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMin64Async(long intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMin64Async(intBody), serviceCallback);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMin64WithRestResponseAsync(long intBody) {
        return service.putMin64(intBody);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putMin64Async(long intBody) {
        return putMin64WithRestResponseAsync(intBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DateTime object if successful.
     */
    public DateTime getUnixTime() {
        return getUnixTimeAsync().toBlocking().value();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getUnixTimeWithRestResponseAsync() {
        return service.getUnixTime();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<DateTime> getUnixTimeAsync() {
        return getUnixTimeWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, DateTime>, DateTime>() { public DateTime call(RestResponse<Void, DateTime> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putUnixTimeDate(DateTime intBody) {
        putUnixTimeDateAsync(intBody).toBlocking().value();
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putUnixTimeDateAsync(DateTime intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUnixTimeDateAsync(intBody), serviceCallback);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putUnixTimeDateWithRestResponseAsync(DateTime intBody) {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        return service.putUnixTimeDate(intBodyConverted);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the long value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> putUnixTimeDateAsync(DateTime intBody) {
        return putUnixTimeDateWithRestResponseAsync(intBody)
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get invalid Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DateTime object if successful.
     */
    public DateTime getInvalidUnixTime() {
        return getInvalidUnixTimeAsync().toBlocking().value();
    }

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getInvalidUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get invalid Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getInvalidUnixTimeWithRestResponseAsync() {
        return service.getInvalidUnixTime();
    }

    /**
     * Get invalid Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<DateTime> getInvalidUnixTimeAsync() {
        return getInvalidUnixTimeWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, DateTime>, DateTime>() { public DateTime call(RestResponse<Void, DateTime> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get null Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DateTime object if successful.
     */
    public DateTime getNullUnixTime() {
        return getNullUnixTimeAsync().toBlocking().value();
    }

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DateTime> getNullUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getNullUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get null Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<RestResponse<Void, DateTime>> getNullUnixTimeWithRestResponseAsync() {
        return service.getNullUnixTime();
    }

    /**
     * Get null Unix time value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, DateTime> object
     */
    public Single<DateTime> getNullUnixTimeAsync() {
        return getNullUnixTimeWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, DateTime>, DateTime>() { public DateTime call(RestResponse<Void, DateTime> restResponse) { return restResponse.body(); } });
        }


}
