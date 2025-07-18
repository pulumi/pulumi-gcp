// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The charset value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    @Import(name="charset")
    private @Nullable Output<String> charset;

    /**
     * @return The charset value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
     * for more details and supported values. Postgres databases only support
     * a value of `UTF8` at creation time.
     * 
     */
    public Optional<Output<String>> charset() {
        return Optional.ofNullable(this.charset);
    }

    /**
     * The collation value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return The collation value. See MySQL&#39;s
     * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
     * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
     * for more details and supported values. Postgres databases only support
     * a value of `en_US.UTF8` at creation time.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * The deletion policy for the database. Setting ABANDON allows the resource
     * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
     * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
     * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return The deletion policy for the database. Setting ABANDON allows the resource
     * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
     * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
     * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name of the Cloud SQL instance. This does not include the project
     * ID.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the database in the Cloud SQL instance.
     * This does not include the project ID or instance name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.charset = $.charset;
        this.collation = $.collation;
        this.deletionPolicy = $.deletionPolicy;
        this.instance = $.instance;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param charset The charset value. See MySQL&#39;s
         * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
         * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
         * for more details and supported values. Postgres databases only support
         * a value of `UTF8` at creation time.
         * 
         * @return builder
         * 
         */
        public Builder charset(@Nullable Output<String> charset) {
            $.charset = charset;
            return this;
        }

        /**
         * @param charset The charset value. See MySQL&#39;s
         * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
         * and Postgres&#39; [Character Set Support](https://www.postgresql.org/docs/9.6/static/multibyte.html)
         * for more details and supported values. Postgres databases only support
         * a value of `UTF8` at creation time.
         * 
         * @return builder
         * 
         */
        public Builder charset(String charset) {
            return charset(Output.of(charset));
        }

        /**
         * @param collation The collation value. See MySQL&#39;s
         * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
         * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
         * for more details and supported values. Postgres databases only support
         * a value of `en_US.UTF8` at creation time.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation The collation value. See MySQL&#39;s
         * [Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html)
         * and Postgres&#39; [Collation Support](https://www.postgresql.org/docs/9.6/static/collation.html)
         * for more details and supported values. Postgres databases only support
         * a value of `en_US.UTF8` at creation time.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        /**
         * @param deletionPolicy The deletion policy for the database. Setting ABANDON allows the resource
         * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
         * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
         * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy The deletion policy for the database. Setting ABANDON allows the resource
         * to be abandoned rather than deleted. This is useful for Postgres, where databases cannot be
         * deleted from the API if there are users other than cloudsqlsuperuser with access. Possible
         * values are: &#34;ABANDON&#34;, &#34;DELETE&#34;. Defaults to &#34;DELETE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param instance The name of the Cloud SQL instance. This does not include the project
         * ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the Cloud SQL instance. This does not include the project
         * ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param name The name of the database in the Cloud SQL instance.
         * This does not include the project ID or instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database in the Cloud SQL instance.
         * This does not include the project ID or instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DatabaseArgs build() {
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("DatabaseArgs", "instance");
            }
            return $;
        }
    }

}
