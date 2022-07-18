// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs Empty = new TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs();

    /**
     * Azure shared access signature. See [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    @Import(name="sasToken", required=true)
    private Output<String> sasToken;

    /**
     * @return Azure shared access signature. See [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
     * 
     */
    public Output<String> sasToken() {
        return this.sasToken;
    }

    private TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs() {}

    private TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs $) {
        this.sasToken = $.sasToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs $;

        public Builder() {
            $ = new TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs();
        }

        public Builder(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs defaults) {
            $ = new TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sasToken Azure shared access signature. See [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
         * 
         * @return builder
         * 
         */
        public Builder sasToken(Output<String> sasToken) {
            $.sasToken = sasToken;
            return this;
        }

        /**
         * @param sasToken Azure shared access signature. See [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
         * 
         * @return builder
         * 
         */
        public Builder sasToken(String sasToken) {
            return sasToken(Output.of(sasToken));
        }

        public TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs build() {
            $.sasToken = Objects.requireNonNull($.sasToken, "expected parameter 'sasToken' to be non-null");
            return $;
        }
    }

}