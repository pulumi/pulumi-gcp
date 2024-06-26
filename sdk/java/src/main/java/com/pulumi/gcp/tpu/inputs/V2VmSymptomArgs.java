// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2VmSymptomArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2VmSymptomArgs Empty = new V2VmSymptomArgs();

    /**
     * (Output)
     * Timestamp when the Symptom is created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return (Output)
     * Timestamp when the Symptom is created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * (Output)
     * Detailed information of the current Symptom.
     * 
     */
    @Import(name="details")
    private @Nullable Output<String> details;

    /**
     * @return (Output)
     * Detailed information of the current Symptom.
     * 
     */
    public Optional<Output<String>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * (Output)
     * Type of the Symptom.
     * 
     */
    @Import(name="symptomType")
    private @Nullable Output<String> symptomType;

    /**
     * @return (Output)
     * Type of the Symptom.
     * 
     */
    public Optional<Output<String>> symptomType() {
        return Optional.ofNullable(this.symptomType);
    }

    /**
     * (Output)
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
     */
    @Import(name="workerId")
    private @Nullable Output<String> workerId;

    /**
     * @return (Output)
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
     */
    public Optional<Output<String>> workerId() {
        return Optional.ofNullable(this.workerId);
    }

    private V2VmSymptomArgs() {}

    private V2VmSymptomArgs(V2VmSymptomArgs $) {
        this.createTime = $.createTime;
        this.details = $.details;
        this.symptomType = $.symptomType;
        this.workerId = $.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2VmSymptomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2VmSymptomArgs $;

        public Builder() {
            $ = new V2VmSymptomArgs();
        }

        public Builder(V2VmSymptomArgs defaults) {
            $ = new V2VmSymptomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime (Output)
         * Timestamp when the Symptom is created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime (Output)
         * Timestamp when the Symptom is created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param details (Output)
         * Detailed information of the current Symptom.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<String> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details (Output)
         * Detailed information of the current Symptom.
         * 
         * @return builder
         * 
         */
        public Builder details(String details) {
            return details(Output.of(details));
        }

        /**
         * @param symptomType (Output)
         * Type of the Symptom.
         * 
         * @return builder
         * 
         */
        public Builder symptomType(@Nullable Output<String> symptomType) {
            $.symptomType = symptomType;
            return this;
        }

        /**
         * @param symptomType (Output)
         * Type of the Symptom.
         * 
         * @return builder
         * 
         */
        public Builder symptomType(String symptomType) {
            return symptomType(Output.of(symptomType));
        }

        /**
         * @param workerId (Output)
         * A string used to uniquely distinguish a worker within a TPU node.
         * 
         * @return builder
         * 
         */
        public Builder workerId(@Nullable Output<String> workerId) {
            $.workerId = workerId;
            return this;
        }

        /**
         * @param workerId (Output)
         * A string used to uniquely distinguish a worker within a TPU node.
         * 
         * @return builder
         * 
         */
        public Builder workerId(String workerId) {
            return workerId(Output.of(workerId));
        }

        public V2VmSymptomArgs build() {
            return $;
        }
    }

}
