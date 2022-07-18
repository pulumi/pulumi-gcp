// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountAccessTokenArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountAccessTokenPlainArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountIdTokenArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountIdTokenPlainArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountKeyArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountKeyPlainArgs;
import com.pulumi.gcp.serviceAccount.inputs.GetAccountPlainArgs;
import com.pulumi.gcp.serviceAccount.outputs.GetAccountAccessTokenResult;
import com.pulumi.gcp.serviceAccount.outputs.GetAccountIdTokenResult;
import com.pulumi.gcp.serviceAccount.outputs.GetAccountKeyResult;
import com.pulumi.gcp.serviceAccount.outputs.GetAccountResult;
import java.util.concurrent.CompletableFuture;

public final class ServiceAccountFunctions {
    /**
     * Get the service account from a project. For more information see
     * the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var objectViewer = Output.of(ServiceAccountFunctions.getAccount(GetAccountArgs.builder()
     *             .accountId(&#34;object-viewer&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Get the service account from a project. For more information see
     * the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var objectViewer = Output.of(ServiceAccountFunctions.getAccount(GetAccountArgs.builder()
     *             .accountId(&#34;object-viewer&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args) {
        return getAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get the service account from a project. For more information see
     * the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var objectViewer = Output.of(ServiceAccountFunctions.getAccount(GetAccountArgs.builder()
     *             .accountId(&#34;object-viewer&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:serviceAccount/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get the service account from a project. For more information see
     * the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var objectViewer = Output.of(ServiceAccountFunctions.getAccount(GetAccountArgs.builder()
     *             .accountId(&#34;object-viewer&#34;)
     *             .build()));
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccountPlain(GetAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:serviceAccount/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a google `oauth2` `access_token` for a different service account than the one initially running the script.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     * 
     */
    public static Output<GetAccountAccessTokenResult> getAccountAccessToken(GetAccountAccessTokenArgs args) {
        return getAccountAccessToken(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a google `oauth2` `access_token` for a different service account than the one initially running the script.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     * 
     */
    public static CompletableFuture<GetAccountAccessTokenResult> getAccountAccessTokenPlain(GetAccountAccessTokenPlainArgs args) {
        return getAccountAccessTokenPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a google `oauth2` `access_token` for a different service account than the one initially running the script.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     * 
     */
    public static Output<GetAccountAccessTokenResult> getAccountAccessToken(GetAccountAccessTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:serviceAccount/getAccountAccessToken:getAccountAccessToken", TypeShape.of(GetAccountAccessTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a google `oauth2` `access_token` for a different service account than the one initially running the script.
     * 
     * For more information see
     * [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     * 
     */
    public static CompletableFuture<GetAccountAccessTokenResult> getAccountAccessTokenPlain(GetAccountAccessTokenPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:serviceAccount/getAccountAccessToken:getAccountAccessToken", TypeShape.of(GetAccountAccessTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a Google OpenID Connect (`oidc`) `id_token`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     * For more information see
     * [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     * 
     * ## Example Usage
     * 
     * ### ServiceAccount JSON Credential File.
     *   `gcp.serviceAccount.getAccountIdToken` will use the configured provider credentials
     * 
     * ### Service Account Impersonation.
     *   `gcp.serviceAccount.getAccountAccessToken` will use background impersonated credentials provided by `gcp.serviceAccount.getAccountAccessToken`.
     * 
     *   Note: to use the following, you must grant `target_service_account` the
     *   `roles/iam.serviceAccountTokenCreator` role on itself.
     * 
     */
    public static Output<GetAccountIdTokenResult> getAccountIdToken(GetAccountIdTokenArgs args) {
        return getAccountIdToken(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a Google OpenID Connect (`oidc`) `id_token`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     * For more information see
     * [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     * 
     * ## Example Usage
     * 
     * ### ServiceAccount JSON Credential File.
     *   `gcp.serviceAccount.getAccountIdToken` will use the configured provider credentials
     * 
     * ### Service Account Impersonation.
     *   `gcp.serviceAccount.getAccountAccessToken` will use background impersonated credentials provided by `gcp.serviceAccount.getAccountAccessToken`.
     * 
     *   Note: to use the following, you must grant `target_service_account` the
     *   `roles/iam.serviceAccountTokenCreator` role on itself.
     * 
     */
    public static CompletableFuture<GetAccountIdTokenResult> getAccountIdTokenPlain(GetAccountIdTokenPlainArgs args) {
        return getAccountIdTokenPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a Google OpenID Connect (`oidc`) `id_token`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     * For more information see
     * [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     * 
     * ## Example Usage
     * 
     * ### ServiceAccount JSON Credential File.
     *   `gcp.serviceAccount.getAccountIdToken` will use the configured provider credentials
     * 
     * ### Service Account Impersonation.
     *   `gcp.serviceAccount.getAccountAccessToken` will use background impersonated credentials provided by `gcp.serviceAccount.getAccountAccessToken`.
     * 
     *   Note: to use the following, you must grant `target_service_account` the
     *   `roles/iam.serviceAccountTokenCreator` role on itself.
     * 
     */
    public static Output<GetAccountIdTokenResult> getAccountIdToken(GetAccountIdTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:serviceAccount/getAccountIdToken:getAccountIdToken", TypeShape.of(GetAccountIdTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a Google OpenID Connect (`oidc`) `id_token`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     * For more information see
     * [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     * 
     * ## Example Usage
     * 
     * ### ServiceAccount JSON Credential File.
     *   `gcp.serviceAccount.getAccountIdToken` will use the configured provider credentials
     * 
     * ### Service Account Impersonation.
     *   `gcp.serviceAccount.getAccountAccessToken` will use background impersonated credentials provided by `gcp.serviceAccount.getAccountAccessToken`.
     * 
     *   Note: to use the following, you must grant `target_service_account` the
     *   `roles/iam.serviceAccountTokenCreator` role on itself.
     * 
     */
    public static CompletableFuture<GetAccountIdTokenResult> getAccountIdTokenPlain(GetAccountIdTokenPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:serviceAccount/getAccountIdToken:getAccountIdToken", TypeShape.of(GetAccountIdTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var myaccount = new Account(&#34;myaccount&#34;, AccountArgs.builder()        
     *             .accountId(&#34;dev-foo-account&#34;)
     *             .build());
     * 
     *         var mykeyKey = new Key(&#34;mykeyKey&#34;, KeyArgs.builder()        
     *             .serviceAccountId(myaccount.name())
     *             .build());
     * 
     *         final var mykeyAccountKey = ServiceAccountFunctions.getAccountKey(GetAccountKeyArgs.builder()
     *             .name(mykeyKey.name())
     *             .publicKeyType(&#34;TYPE_X509_PEM_FILE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountKeyResult> getAccountKey(GetAccountKeyArgs args) {
        return getAccountKey(args, InvokeOptions.Empty);
    }
    /**
     * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var myaccount = new Account(&#34;myaccount&#34;, AccountArgs.builder()        
     *             .accountId(&#34;dev-foo-account&#34;)
     *             .build());
     * 
     *         var mykeyKey = new Key(&#34;mykeyKey&#34;, KeyArgs.builder()        
     *             .serviceAccountId(myaccount.name())
     *             .build());
     * 
     *         final var mykeyAccountKey = ServiceAccountFunctions.getAccountKey(GetAccountKeyArgs.builder()
     *             .name(mykeyKey.name())
     *             .publicKeyType(&#34;TYPE_X509_PEM_FILE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountKeyResult> getAccountKeyPlain(GetAccountKeyPlainArgs args) {
        return getAccountKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var myaccount = new Account(&#34;myaccount&#34;, AccountArgs.builder()        
     *             .accountId(&#34;dev-foo-account&#34;)
     *             .build());
     * 
     *         var mykeyKey = new Key(&#34;mykeyKey&#34;, KeyArgs.builder()        
     *             .serviceAccountId(myaccount.name())
     *             .build());
     * 
     *         final var mykeyAccountKey = ServiceAccountFunctions.getAccountKey(GetAccountKeyArgs.builder()
     *             .name(mykeyKey.name())
     *             .publicKeyType(&#34;TYPE_X509_PEM_FILE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAccountKeyResult> getAccountKey(GetAccountKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:serviceAccount/getAccountKey:getAccountKey", TypeShape.of(GetAccountKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get).
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var myaccount = new Account(&#34;myaccount&#34;, AccountArgs.builder()        
     *             .accountId(&#34;dev-foo-account&#34;)
     *             .build());
     * 
     *         var mykeyKey = new Key(&#34;mykeyKey&#34;, KeyArgs.builder()        
     *             .serviceAccountId(myaccount.name())
     *             .build());
     * 
     *         final var mykeyAccountKey = ServiceAccountFunctions.getAccountKey(GetAccountKeyArgs.builder()
     *             .name(mykeyKey.name())
     *             .publicKeyType(&#34;TYPE_X509_PEM_FILE&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountKeyResult> getAccountKeyPlain(GetAccountKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:serviceAccount/getAccountKey:getAccountKey", TypeShape.of(GetAccountKeyResult.class), args, Utilities.withVersion(options));
    }
}