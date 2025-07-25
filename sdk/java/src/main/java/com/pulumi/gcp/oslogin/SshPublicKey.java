// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oslogin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.oslogin.SshPublicKeyArgs;
import com.pulumi.gcp.oslogin.inputs.SshPublicKeyState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The SSH public key information associated with a Google account.
 * 
 * To get more information about SSHPublicKey, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/oslogin/rest/v1/users.sshPublicKeys)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/oslogin)
 * 
 * ## Example Usage
 * 
 * ### Os Login Ssh Key Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.oslogin.SshPublicKey;
 * import com.pulumi.gcp.oslogin.SshPublicKeyArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
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
 *         final var me = OrganizationsFunctions.getClientOpenIdUserInfo(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var cache = new SshPublicKey("cache", SshPublicKeyArgs.builder()
 *             .user(me.email())
 *             .key(StdFunctions.file(FileArgs.builder()
 *                 .input("path/to/id_rsa.pub")
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * SSHPublicKey can be imported using any of these accepted formats:
 * 
 * * `users/{{user}}/sshPublicKeys/{{fingerprint}}`
 * 
 * * `{{user}}/{{fingerprint}}`
 * 
 * When using the `pulumi import` command, SSHPublicKey can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:oslogin/sshPublicKey:SshPublicKey default users/{{user}}/sshPublicKeys/{{fingerprint}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:oslogin/sshPublicKey:SshPublicKey default {{user}}/{{fingerprint}}
 * ```
 * 
 */
@ResourceType(type="gcp:oslogin/sshPublicKey:SshPublicKey")
public class SshPublicKey extends com.pulumi.resources.CustomResource {
    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Export(name="expirationTimeUsec", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expirationTimeUsec;

    /**
     * @return An expiration time in microseconds since epoch.
     * 
     */
    public Output<Optional<String>> expirationTimeUsec() {
        return Codegen.optional(this.expirationTimeUsec);
    }
    /**
     * The SHA-256 fingerprint of the SSH public key.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The SHA-256 fingerprint of the SSH public key.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> project;

    /**
     * @return The project ID of the Google Cloud Platform project.
     * 
     */
    public Output<Optional<String>> project() {
        return Codegen.optional(this.project);
    }
    /**
     * The user email.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The user email.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshPublicKey(java.lang.String name) {
        this(name, SshPublicKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshPublicKey(java.lang.String name, SshPublicKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshPublicKey(java.lang.String name, SshPublicKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:oslogin/sshPublicKey:SshPublicKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SshPublicKey(java.lang.String name, Output<java.lang.String> id, @Nullable SshPublicKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:oslogin/sshPublicKey:SshPublicKey", name, state, makeResourceOptions(options, id), false);
    }

    private static SshPublicKeyArgs makeArgs(SshPublicKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SshPublicKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static SshPublicKey get(java.lang.String name, Output<java.lang.String> id, @Nullable SshPublicKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshPublicKey(name, id, state, options);
    }
}
