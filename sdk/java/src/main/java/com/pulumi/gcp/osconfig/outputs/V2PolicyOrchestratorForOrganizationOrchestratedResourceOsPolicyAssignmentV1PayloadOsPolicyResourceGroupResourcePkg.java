// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgApt;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDeb;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGooget;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsi;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYum;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypper;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg {
    /**
     * @return A package managed by APT.
     * - install: `apt-get update &amp;&amp; apt-get -y install [name]`
     * - remove: `apt-get -y remove [name]`
     *   Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgApt apt;
    /**
     * @return A deb package file. dpkg packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDeb deb;
    /**
     * @return Required. The desired state the agent should maintain for this package.
     * Possible values:
     * DESIRED_STATE_UNSPECIFIED
     * INSTALLED
     * REMOVED
     * 
     */
    private String desiredState;
    /**
     * @return A package managed by GooGet.
     * - install: `googet -noconfirm install package`
     * - remove: `googet -noconfirm remove package`
     *   Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGooget googet;
    /**
     * @return An MSI package. MSI packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsi msi;
    /**
     * @return An RPM package file. RPM packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm rpm;
    /**
     * @return A package managed by YUM.
     * - install: `yum -y install package`
     * - remove: `yum -y remove package`
     *   Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYum yum;
    /**
     * @return A package managed by Zypper.
     * - install: `zypper -y install package`
     * - remove: `zypper -y rm package`
     *   Structure is documented below.
     * 
     */
    private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypper zypper;

    private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg() {}
    /**
     * @return A package managed by APT.
     * - install: `apt-get update &amp;&amp; apt-get -y install [name]`
     * - remove: `apt-get -y remove [name]`
     *   Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgApt> apt() {
        return Optional.ofNullable(this.apt);
    }
    /**
     * @return A deb package file. dpkg packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDeb> deb() {
        return Optional.ofNullable(this.deb);
    }
    /**
     * @return Required. The desired state the agent should maintain for this package.
     * Possible values:
     * DESIRED_STATE_UNSPECIFIED
     * INSTALLED
     * REMOVED
     * 
     */
    public String desiredState() {
        return this.desiredState;
    }
    /**
     * @return A package managed by GooGet.
     * - install: `googet -noconfirm install package`
     * - remove: `googet -noconfirm remove package`
     *   Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGooget> googet() {
        return Optional.ofNullable(this.googet);
    }
    /**
     * @return An MSI package. MSI packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsi> msi() {
        return Optional.ofNullable(this.msi);
    }
    /**
     * @return An RPM package file. RPM packages only support INSTALLED state.
     * Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm> rpm() {
        return Optional.ofNullable(this.rpm);
    }
    /**
     * @return A package managed by YUM.
     * - install: `yum -y install package`
     * - remove: `yum -y remove package`
     *   Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYum> yum() {
        return Optional.ofNullable(this.yum);
    }
    /**
     * @return A package managed by Zypper.
     * - install: `zypper -y install package`
     * - remove: `zypper -y rm package`
     *   Structure is documented below.
     * 
     */
    public Optional<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypper> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgApt apt;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDeb deb;
        private String desiredState;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGooget googet;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsi msi;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm rpm;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYum yum;
        private @Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypper zypper;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.deb = defaults.deb;
    	      this.desiredState = defaults.desiredState;
    	      this.googet = defaults.googet;
    	      this.msi = defaults.msi;
    	      this.rpm = defaults.rpm;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        @CustomType.Setter
        public Builder apt(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgApt apt) {

            this.apt = apt;
            return this;
        }
        @CustomType.Setter
        public Builder deb(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgDeb deb) {

            this.deb = deb;
            return this;
        }
        @CustomType.Setter
        public Builder desiredState(String desiredState) {
            if (desiredState == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg", "desiredState");
            }
            this.desiredState = desiredState;
            return this;
        }
        @CustomType.Setter
        public Builder googet(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgGooget googet) {

            this.googet = googet;
            return this;
        }
        @CustomType.Setter
        public Builder msi(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgMsi msi) {

            this.msi = msi;
            return this;
        }
        @CustomType.Setter
        public Builder rpm(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgRpm rpm) {

            this.rpm = rpm;
            return this;
        }
        @CustomType.Setter
        public Builder yum(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgYum yum) {

            this.yum = yum;
            return this;
        }
        @CustomType.Setter
        public Builder zypper(@Nullable V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkgZypper zypper) {

            this.zypper = zypper;
            return this;
        }
        public V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg build() {
            final var _resultValue = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourcePkg();
            _resultValue.apt = apt;
            _resultValue.deb = deb;
            _resultValue.desiredState = desiredState;
            _resultValue.googet = googet;
            _resultValue.msi = msi;
            _resultValue.rpm = rpm;
            _resultValue.yum = yum;
            _resultValue.zypper = zypper;
            return _resultValue;
        }
    }
}
