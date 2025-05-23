// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceDirectoryServicesLdapArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceDirectoryServicesLdapArgs Empty = new InstanceDirectoryServicesLdapArgs();

    /**
     * The LDAP domain name in the format of `my-domain.com`.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The LDAP domain name in the format of `my-domain.com`.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The groups Organizational Unit (OU) is optional. This parameter is a hint
     * to allow faster lookup in the LDAP namespace. In case that this parameter
     * is not provided, Filestore instance will query the whole LDAP namespace.
     * 
     */
    @Import(name="groupsOu")
    private @Nullable Output<String> groupsOu;

    /**
     * @return The groups Organizational Unit (OU) is optional. This parameter is a hint
     * to allow faster lookup in the LDAP namespace. In case that this parameter
     * is not provided, Filestore instance will query the whole LDAP namespace.
     * 
     */
    public Optional<Output<String>> groupsOu() {
        return Optional.ofNullable(this.groupsOu);
    }

    /**
     * The servers names are used for specifying the LDAP servers names.
     * The LDAP servers names can come with two formats:
     * 1. DNS name, for example: `ldap.example1.com`, `ldap.example2.com`.
     * 2. IP address, for example: `10.0.0.1`, `10.0.0.2`, `10.0.0.3`.
     *    All servers names must be in the same format: either all DNS names or all
     *    IP addresses.
     * 
     */
    @Import(name="servers", required=true)
    private Output<List<String>> servers;

    /**
     * @return The servers names are used for specifying the LDAP servers names.
     * The LDAP servers names can come with two formats:
     * 1. DNS name, for example: `ldap.example1.com`, `ldap.example2.com`.
     * 2. IP address, for example: `10.0.0.1`, `10.0.0.2`, `10.0.0.3`.
     *    All servers names must be in the same format: either all DNS names or all
     *    IP addresses.
     * 
     */
    public Output<List<String>> servers() {
        return this.servers;
    }

    /**
     * The users Organizational Unit (OU) is optional. This parameter is a hint
     * to allow faster lookup in the LDAP namespace. In case that this parameter
     * is not provided, Filestore instance will query the whole LDAP namespace.
     * 
     */
    @Import(name="usersOu")
    private @Nullable Output<String> usersOu;

    /**
     * @return The users Organizational Unit (OU) is optional. This parameter is a hint
     * to allow faster lookup in the LDAP namespace. In case that this parameter
     * is not provided, Filestore instance will query the whole LDAP namespace.
     * 
     */
    public Optional<Output<String>> usersOu() {
        return Optional.ofNullable(this.usersOu);
    }

    private InstanceDirectoryServicesLdapArgs() {}

    private InstanceDirectoryServicesLdapArgs(InstanceDirectoryServicesLdapArgs $) {
        this.domain = $.domain;
        this.groupsOu = $.groupsOu;
        this.servers = $.servers;
        this.usersOu = $.usersOu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceDirectoryServicesLdapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceDirectoryServicesLdapArgs $;

        public Builder() {
            $ = new InstanceDirectoryServicesLdapArgs();
        }

        public Builder(InstanceDirectoryServicesLdapArgs defaults) {
            $ = new InstanceDirectoryServicesLdapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The LDAP domain name in the format of `my-domain.com`.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The LDAP domain name in the format of `my-domain.com`.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param groupsOu The groups Organizational Unit (OU) is optional. This parameter is a hint
         * to allow faster lookup in the LDAP namespace. In case that this parameter
         * is not provided, Filestore instance will query the whole LDAP namespace.
         * 
         * @return builder
         * 
         */
        public Builder groupsOu(@Nullable Output<String> groupsOu) {
            $.groupsOu = groupsOu;
            return this;
        }

        /**
         * @param groupsOu The groups Organizational Unit (OU) is optional. This parameter is a hint
         * to allow faster lookup in the LDAP namespace. In case that this parameter
         * is not provided, Filestore instance will query the whole LDAP namespace.
         * 
         * @return builder
         * 
         */
        public Builder groupsOu(String groupsOu) {
            return groupsOu(Output.of(groupsOu));
        }

        /**
         * @param servers The servers names are used for specifying the LDAP servers names.
         * The LDAP servers names can come with two formats:
         * 1. DNS name, for example: `ldap.example1.com`, `ldap.example2.com`.
         * 2. IP address, for example: `10.0.0.1`, `10.0.0.2`, `10.0.0.3`.
         *    All servers names must be in the same format: either all DNS names or all
         *    IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder servers(Output<List<String>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers The servers names are used for specifying the LDAP servers names.
         * The LDAP servers names can come with two formats:
         * 1. DNS name, for example: `ldap.example1.com`, `ldap.example2.com`.
         * 2. IP address, for example: `10.0.0.1`, `10.0.0.2`, `10.0.0.3`.
         *    All servers names must be in the same format: either all DNS names or all
         *    IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<String> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers The servers names are used for specifying the LDAP servers names.
         * The LDAP servers names can come with two formats:
         * 1. DNS name, for example: `ldap.example1.com`, `ldap.example2.com`.
         * 2. IP address, for example: `10.0.0.1`, `10.0.0.2`, `10.0.0.3`.
         *    All servers names must be in the same format: either all DNS names or all
         *    IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param usersOu The users Organizational Unit (OU) is optional. This parameter is a hint
         * to allow faster lookup in the LDAP namespace. In case that this parameter
         * is not provided, Filestore instance will query the whole LDAP namespace.
         * 
         * @return builder
         * 
         */
        public Builder usersOu(@Nullable Output<String> usersOu) {
            $.usersOu = usersOu;
            return this;
        }

        /**
         * @param usersOu The users Organizational Unit (OU) is optional. This parameter is a hint
         * to allow faster lookup in the LDAP namespace. In case that this parameter
         * is not provided, Filestore instance will query the whole LDAP namespace.
         * 
         * @return builder
         * 
         */
        public Builder usersOu(String usersOu) {
            return usersOu(Output.of(usersOu));
        }

        public InstanceDirectoryServicesLdapArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("InstanceDirectoryServicesLdapArgs", "domain");
            }
            if ($.servers == null) {
                throw new MissingRequiredPropertyException("InstanceDirectoryServicesLdapArgs", "servers");
            }
            return $;
        }
    }

}
