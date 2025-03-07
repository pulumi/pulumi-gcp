// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyPlainArgs;
import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyPlainArgs;
import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyPlainArgs;
import com.pulumi.gcp.apigateway.outputs.GetApiConfigIamPolicyResult;
import com.pulumi.gcp.apigateway.outputs.GetApiIamPolicyResult;
import com.pulumi.gcp.apigateway.outputs.GetGatewayIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class ApigatewayFunctions {
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiConfigIamPolicy(GetApiConfigIamPolicyArgs.builder()
     *             .api(apiCfg.api())
     *             .apiConfig(apiCfg.apiConfigId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args) {
        return getApiConfigIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiConfigIamPolicy(GetApiConfigIamPolicyArgs.builder()
     *             .api(apiCfg.api())
     *             .apiConfig(apiCfg.apiConfigId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicyPlain(GetApiConfigIamPolicyPlainArgs args) {
        return getApiConfigIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiConfigIamPolicy(GetApiConfigIamPolicyArgs.builder()
     *             .api(apiCfg.api())
     *             .apiConfig(apiCfg.apiConfigId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getApiConfigIamPolicy:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiConfigIamPolicy(GetApiConfigIamPolicyArgs.builder()
     *             .api(apiCfg.api())
     *             .apiConfig(apiCfg.apiConfigId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiConfigIamPolicyResult> getApiConfigIamPolicy(GetApiConfigIamPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getApiConfigIamPolicy:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiConfigIamPolicy(GetApiConfigIamPolicyArgs.builder()
     *             .api(apiCfg.api())
     *             .apiConfig(apiCfg.apiConfigId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApiConfigIamPolicyResult> getApiConfigIamPolicyPlain(GetApiConfigIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:apigateway/getApiConfigIamPolicy:getApiConfigIamPolicy", TypeShape.of(GetApiConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiIamPolicy(GetApiIamPolicyArgs.builder()
     *             .project(api.project())
     *             .api(api.apiId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args) {
        return getApiIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiIamPolicy(GetApiIamPolicyArgs.builder()
     *             .project(api.project())
     *             .api(api.apiId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicyPlain(GetApiIamPolicyPlainArgs args) {
        return getApiIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiIamPolicy(GetApiIamPolicyArgs.builder()
     *             .project(api.project())
     *             .api(api.apiId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getApiIamPolicy:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiIamPolicy(GetApiIamPolicyArgs.builder()
     *             .project(api.project())
     *             .api(api.apiId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApiIamPolicyResult> getApiIamPolicy(GetApiIamPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getApiIamPolicy:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getApiIamPolicy(GetApiIamPolicyArgs.builder()
     *             .project(api.project())
     *             .api(api.apiId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApiIamPolicyResult> getApiIamPolicyPlain(GetApiIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:apigateway/getApiIamPolicy:getApiIamPolicy", TypeShape.of(GetApiIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getGatewayIamPolicy(GetGatewayIamPolicyArgs.builder()
     *             .project(apiGw.project())
     *             .region(apiGw.region())
     *             .gateway(apiGw.gatewayId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args) {
        return getGatewayIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getGatewayIamPolicy(GetGatewayIamPolicyArgs.builder()
     *             .project(apiGw.project())
     *             .region(apiGw.region())
     *             .gateway(apiGw.gatewayId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args) {
        return getGatewayIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getGatewayIamPolicy(GetGatewayIamPolicyArgs.builder()
     *             .project(apiGw.project())
     *             .region(apiGw.region())
     *             .gateway(apiGw.gatewayId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getGatewayIamPolicy(GetGatewayIamPolicyArgs.builder()
     *             .project(apiGw.project())
     *             .region(apiGw.region())
     *             .gateway(apiGw.gatewayId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.apigateway.ApigatewayFunctions;
     * import com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs;
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
     *         final var policy = ApigatewayFunctions.getGatewayIamPolicy(GetGatewayIamPolicyArgs.builder()
     *             .project(apiGw.project())
     *             .region(apiGw.region())
     *             .gateway(apiGw.gatewayId())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:apigateway/getGatewayIamPolicy:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
