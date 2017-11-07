/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydictionary.implementation;

import fixtures.bodydictionary.AutoRestSwaggerBATdictionaryService;
import fixtures.bodydictionary.Dictionarys;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceClient;
import com.microsoft.rest.v2.RestClient;
import io.reactivex.Single;

/**
 * Initializes a new instance of the AutoRestSwaggerBATdictionaryService class.
 */
public class AutoRestSwaggerBATdictionaryServiceImpl extends ServiceClient implements AutoRestSwaggerBATdictionaryService {

    /**
     * The Dictionarys object to access its operations.
     */
    private Dictionarys dictionarys;

    /**
     * Gets the Dictionarys object to access its operations.
     * @return the Dictionarys object.
     */
    public Dictionarys dictionarys() {
        return this.dictionarys;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATdictionaryService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATdictionaryServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATdictionaryService client.
     *
     */
    public AutoRestSwaggerBATdictionaryServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATdictionaryService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestSwaggerBATdictionaryServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.dictionarys = new DictionarysImpl(this);
    }
}
