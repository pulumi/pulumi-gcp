// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datastream.ConnectionProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileState;
import com.pulumi.gcp.datastream.outputs.ConnectionProfileForwardSshConnectivity;
import com.pulumi.gcp.datastream.outputs.ConnectionProfileGcsProfile;
import com.pulumi.gcp.datastream.outputs.ConnectionProfileMysqlProfile;
import com.pulumi.gcp.datastream.outputs.ConnectionProfileOracleProfile;
import com.pulumi.gcp.datastream.outputs.ConnectionProfilePostgresqlProfile;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Datastream Connection Profile Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datastream.ConnectionProfile;
 * import com.pulumi.gcp.datastream.ConnectionProfileArgs;
 * import com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new ConnectionProfile(&#34;default&#34;, ConnectionProfileArgs.builder()        
 *             .connectionProfileId(&#34;my-profile&#34;)
 *             .displayName(&#34;Connection profile&#34;)
 *             .gcsProfile(ConnectionProfileGcsProfileArgs.builder()
 *                 .bucket(&#34;my-bucket&#34;)
 *                 .rootPath(&#34;/path&#34;)
 *                 .build())
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Datastream Connection Profile Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.datastream.ConnectionProfile;
 * import com.pulumi.gcp.datastream.ConnectionProfileArgs;
 * import com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs;
 * import com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new ConnectionProfile(&#34;default&#34;, ConnectionProfileArgs.builder()        
 *             .connectionProfileId(&#34;my-profile&#34;)
 *             .displayName(&#34;Connection profile&#34;)
 *             .forwardSshConnectivity(ConnectionProfileForwardSshConnectivityArgs.builder()
 *                 .hostname(&#34;google.com&#34;)
 *                 .password(&#34;swordfish&#34;)
 *                 .port(8022)
 *                 .username(&#34;my-user&#34;)
 *                 .build())
 *             .gcsProfile(ConnectionProfileGcsProfileArgs.builder()
 *                 .bucket(&#34;my-bucket&#34;)
 *                 .rootPath(&#34;/path&#34;)
 *                 .build())
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Datastream Connection Profile Postgres
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.sql.DatabaseInstance;
 * import com.pulumi.gcp.sql.DatabaseInstanceArgs;
 * import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs;
 * import com.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationArgs;
 * import com.pulumi.gcp.sql.Database;
 * import com.pulumi.gcp.sql.DatabaseArgs;
 * import com.pulumi.random.RandomPassword;
 * import com.pulumi.random.RandomPasswordArgs;
 * import com.pulumi.gcp.sql.User;
 * import com.pulumi.gcp.sql.UserArgs;
 * import com.pulumi.gcp.datastream.ConnectionProfile;
 * import com.pulumi.gcp.datastream.ConnectionProfileArgs;
 * import com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var instance = new DatabaseInstance(&#34;instance&#34;, DatabaseInstanceArgs.builder()        
 *             .databaseVersion(&#34;POSTGRES_14&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .settings(DatabaseInstanceSettingsArgs.builder()
 *                 .tier(&#34;db-f1-micro&#34;)
 *                 .ipConfiguration(DatabaseInstanceSettingsIpConfigurationArgs.builder()
 *                     .authorizedNetworks(                    
 *                         DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder()
 *                             .value(&#34;34.71.242.81&#34;)
 *                             .build(),
 *                         DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder()
 *                             .value(&#34;34.72.28.29&#34;)
 *                             .build(),
 *                         DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder()
 *                             .value(&#34;34.67.6.157&#34;)
 *                             .build(),
 *                         DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder()
 *                             .value(&#34;34.67.234.134&#34;)
 *                             .build(),
 *                         DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs.builder()
 *                             .value(&#34;34.72.239.218&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .deletionProtection(&#34;true&#34;)
 *             .build());
 * 
 *         var db = new Database(&#34;db&#34;, DatabaseArgs.builder()        
 *             .instance(instance.name())
 *             .build());
 * 
 *         var pwd = new RandomPassword(&#34;pwd&#34;, RandomPasswordArgs.builder()        
 *             .length(16)
 *             .special(false)
 *             .build());
 * 
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .instance(instance.name())
 *             .password(pwd.result())
 *             .build());
 * 
 *         var default_ = new ConnectionProfile(&#34;default&#34;, ConnectionProfileArgs.builder()        
 *             .displayName(&#34;Connection profile&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .connectionProfileId(&#34;my-profile&#34;)
 *             .postgresqlProfile(ConnectionProfilePostgresqlProfileArgs.builder()
 *                 .hostname(instance.publicIpAddress())
 *                 .username(user.name())
 *                 .password(user.password())
 *                 .database(db.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ConnectionProfile can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default projects/{{project}}/locations/{{location}}/connectionProfiles/{{connection_profile_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default {{project}}/{{location}}/{{connection_profile_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:datastream/connectionProfile:ConnectionProfile default {{location}}/{{connection_profile_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:datastream/connectionProfile:ConnectionProfile")
public class ConnectionProfile extends com.pulumi.resources.CustomResource {
    /**
     * The connection profile identifier.
     * 
     */
    @Export(name="connectionProfileId", type=String.class, parameters={})
    private Output<String> connectionProfileId;

    /**
     * @return The connection profile identifier.
     * 
     */
    public Output<String> connectionProfileId() {
        return this.connectionProfileId;
    }
    /**
     * Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Forward SSH tunnel connectivity.
     * Structure is documented below.
     * 
     */
    @Export(name="forwardSshConnectivity", type=ConnectionProfileForwardSshConnectivity.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileForwardSshConnectivity> forwardSshConnectivity;

    /**
     * @return Forward SSH tunnel connectivity.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionProfileForwardSshConnectivity>> forwardSshConnectivity() {
        return Codegen.optional(this.forwardSshConnectivity);
    }
    /**
     * Cloud Storage bucket profile.
     * Structure is documented below.
     * 
     */
    @Export(name="gcsProfile", type=ConnectionProfileGcsProfile.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileGcsProfile> gcsProfile;

    /**
     * @return Cloud Storage bucket profile.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionProfileGcsProfile>> gcsProfile() {
        return Codegen.optional(this.gcsProfile);
    }
    /**
     * Labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name of the location this repository is located in.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * MySQL database profile.
     * Structure is documented below.
     * 
     */
    @Export(name="mysqlProfile", type=ConnectionProfileMysqlProfile.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileMysqlProfile> mysqlProfile;

    /**
     * @return MySQL database profile.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionProfileMysqlProfile>> mysqlProfile() {
        return Codegen.optional(this.mysqlProfile);
    }
    /**
     * The resource&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Oracle database profile.
     * Structure is documented below.
     * 
     */
    @Export(name="oracleProfile", type=ConnectionProfileOracleProfile.class, parameters={})
    private Output</* @Nullable */ ConnectionProfileOracleProfile> oracleProfile;

    /**
     * @return Oracle database profile.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionProfileOracleProfile>> oracleProfile() {
        return Codegen.optional(this.oracleProfile);
    }
    /**
     * PostgreSQL database profile.
     * Structure is documented below.
     * 
     */
    @Export(name="postgresqlProfile", type=ConnectionProfilePostgresqlProfile.class, parameters={})
    private Output</* @Nullable */ ConnectionProfilePostgresqlProfile> postgresqlProfile;

    /**
     * @return PostgreSQL database profile.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionProfilePostgresqlProfile>> postgresqlProfile() {
        return Codegen.optional(this.postgresqlProfile);
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionProfile(String name) {
        this(name, ConnectionProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastream/connectionProfile:ConnectionProfile", name, args == null ? ConnectionProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionProfile(String name, Output<String> id, @Nullable ConnectionProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datastream/connectionProfile:ConnectionProfile", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConnectionProfile get(String name, Output<String> id, @Nullable ConnectionProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionProfile(name, id, state, options);
    }
}