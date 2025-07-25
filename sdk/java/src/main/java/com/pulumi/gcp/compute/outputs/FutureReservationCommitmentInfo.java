// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FutureReservationCommitmentInfo {
    /**
     * @return name of the commitment where capacity is being delivered to.
     * 
     */
    private @Nullable String commitmentName;
    /**
     * @return Indicates if a Commitment needs to be created as part of FR delivery. If this field is not present, then no commitment needs to be created.
     * Possible values are: `INVALID`, `THIRTY_SIX_MONTH`, `TWELVE_MONTH`.
     * 
     */
    private @Nullable String commitmentPlan;
    /**
     * @return Only applicable if FR is delivering to the same reservation. If set, all parent commitments will be extended to match the end date of the plan for this commitment.
     * Possible values are: `EXTEND`.
     * 
     */
    private @Nullable String previousCommitmentTerms;

    private FutureReservationCommitmentInfo() {}
    /**
     * @return name of the commitment where capacity is being delivered to.
     * 
     */
    public Optional<String> commitmentName() {
        return Optional.ofNullable(this.commitmentName);
    }
    /**
     * @return Indicates if a Commitment needs to be created as part of FR delivery. If this field is not present, then no commitment needs to be created.
     * Possible values are: `INVALID`, `THIRTY_SIX_MONTH`, `TWELVE_MONTH`.
     * 
     */
    public Optional<String> commitmentPlan() {
        return Optional.ofNullable(this.commitmentPlan);
    }
    /**
     * @return Only applicable if FR is delivering to the same reservation. If set, all parent commitments will be extended to match the end date of the plan for this commitment.
     * Possible values are: `EXTEND`.
     * 
     */
    public Optional<String> previousCommitmentTerms() {
        return Optional.ofNullable(this.previousCommitmentTerms);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationCommitmentInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String commitmentName;
        private @Nullable String commitmentPlan;
        private @Nullable String previousCommitmentTerms;
        public Builder() {}
        public Builder(FutureReservationCommitmentInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitmentName = defaults.commitmentName;
    	      this.commitmentPlan = defaults.commitmentPlan;
    	      this.previousCommitmentTerms = defaults.previousCommitmentTerms;
        }

        @CustomType.Setter
        public Builder commitmentName(@Nullable String commitmentName) {

            this.commitmentName = commitmentName;
            return this;
        }
        @CustomType.Setter
        public Builder commitmentPlan(@Nullable String commitmentPlan) {

            this.commitmentPlan = commitmentPlan;
            return this;
        }
        @CustomType.Setter
        public Builder previousCommitmentTerms(@Nullable String previousCommitmentTerms) {

            this.previousCommitmentTerms = previousCommitmentTerms;
            return this;
        }
        public FutureReservationCommitmentInfo build() {
            final var _resultValue = new FutureReservationCommitmentInfo();
            _resultValue.commitmentName = commitmentName;
            _resultValue.commitmentPlan = commitmentPlan;
            _resultValue.previousCommitmentTerms = previousCommitmentTerms;
            return _resultValue;
        }
    }
}
