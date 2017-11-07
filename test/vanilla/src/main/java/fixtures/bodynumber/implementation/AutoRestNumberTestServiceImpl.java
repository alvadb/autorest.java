/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber.implementation;

import fixtures.bodynumber.AutoRestNumberTestService;
import fixtures.bodynumber.Numbers;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.RestClient;
import io.reactivex.Single;

/**
 * Initializes a new instance of the AutoRestNumberTestService class.
 */
public class AutoRestNumberTestServiceImpl extends ServiceClient implements AutoRestNumberTestService {

    /**
     * The Numbers object to access its operations.
     */
    private Numbers numbers;

    /**
     * Gets the Numbers object to access its operations.
     * @return the Numbers object.
     */
    public Numbers numbers() {
        return this.numbers;
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestNumberTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     */
    public AutoRestNumberTestServiceImpl() {
        this("https://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestNumberTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.numbers = new NumbersImpl(this);
    }
}
