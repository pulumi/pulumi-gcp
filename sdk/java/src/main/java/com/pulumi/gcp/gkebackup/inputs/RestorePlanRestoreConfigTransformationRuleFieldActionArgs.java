// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePlanRestoreConfigTransformationRuleFieldActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanRestoreConfigTransformationRuleFieldActionArgs Empty = new RestorePlanRestoreConfigTransformationRuleFieldActionArgs();

    /**
     * A string containing a JSON Pointer value that references the
     * location in the target document to move the value from.
     * 
     */
    @Import(name="fromPath")
    private @Nullable Output<String> fromPath;

    /**
     * @return A string containing a JSON Pointer value that references the
     * location in the target document to move the value from.
     * 
     */
    public Optional<Output<String>> fromPath() {
        return Optional.ofNullable(this.fromPath);
    }

    /**
     * Specifies the operation to perform.
     * Possible values are: `REMOVE`, `MOVE`, `COPY`, `ADD`, `TEST`, `REPLACE`.
     * 
     */
    @Import(name="op", required=true)
    private Output<String> op;

    /**
     * @return Specifies the operation to perform.
     * Possible values are: `REMOVE`, `MOVE`, `COPY`, `ADD`, `TEST`, `REPLACE`.
     * 
     */
    public Output<String> op() {
        return this.op;
    }

    /**
     * A string containing a JSON-Pointer value that references a
     * location within the target document where the operation is performed.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return A string containing a JSON-Pointer value that references a
     * location within the target document where the operation is performed.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * A string that specifies the desired value in string format
     * to use for transformation.
     * 
     * ***
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return A string that specifies the desired value in string format
     * to use for transformation.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RestorePlanRestoreConfigTransformationRuleFieldActionArgs() {}

    private RestorePlanRestoreConfigTransformationRuleFieldActionArgs(RestorePlanRestoreConfigTransformationRuleFieldActionArgs $) {
        this.fromPath = $.fromPath;
        this.op = $.op;
        this.path = $.path;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanRestoreConfigTransformationRuleFieldActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanRestoreConfigTransformationRuleFieldActionArgs $;

        public Builder() {
            $ = new RestorePlanRestoreConfigTransformationRuleFieldActionArgs();
        }

        public Builder(RestorePlanRestoreConfigTransformationRuleFieldActionArgs defaults) {
            $ = new RestorePlanRestoreConfigTransformationRuleFieldActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromPath A string containing a JSON Pointer value that references the
         * location in the target document to move the value from.
         * 
         * @return builder
         * 
         */
        public Builder fromPath(@Nullable Output<String> fromPath) {
            $.fromPath = fromPath;
            return this;
        }

        /**
         * @param fromPath A string containing a JSON Pointer value that references the
         * location in the target document to move the value from.
         * 
         * @return builder
         * 
         */
        public Builder fromPath(String fromPath) {
            return fromPath(Output.of(fromPath));
        }

        /**
         * @param op Specifies the operation to perform.
         * Possible values are: `REMOVE`, `MOVE`, `COPY`, `ADD`, `TEST`, `REPLACE`.
         * 
         * @return builder
         * 
         */
        public Builder op(Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op Specifies the operation to perform.
         * Possible values are: `REMOVE`, `MOVE`, `COPY`, `ADD`, `TEST`, `REPLACE`.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        /**
         * @param path A string containing a JSON-Pointer value that references a
         * location within the target document where the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path A string containing a JSON-Pointer value that references a
         * location within the target document where the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param value A string that specifies the desired value in string format
         * to use for transformation.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A string that specifies the desired value in string format
         * to use for transformation.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RestorePlanRestoreConfigTransformationRuleFieldActionArgs build() {
            $.op = Objects.requireNonNull($.op, "expected parameter 'op' to be non-null");
            return $;
        }
    }

}