/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyarray.implementation;

import com.microsoft.rest.v2.RestClient;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceClient;
import fixtures.bodyarray.Arrays;
import fixtures.bodyarray.AutoRestSwaggerBATArrayService;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestSwaggerBATArrayService class.
 */
public class AutoRestSwaggerBATArrayServiceImpl extends ServiceClient implements AutoRestSwaggerBATArrayService {

    /**
     * The Arrays object to access its operations.
     */
    private Arrays arrays;

    /**
     * Gets the Arrays object to access its operations.
     * @return the Arrays object.
     */
    public Arrays arrays() {
        return this.arrays;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATArrayService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATArrayServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATArrayService client.
     */
    public AutoRestSwaggerBATArrayServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATArrayService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestSwaggerBATArrayServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.arrays = new ArraysImpl(this);
    }
}
