// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.colab;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyPlainArgs;
import com.pulumi.gcp.colab.outputs.GetRuntimeTemplateIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class ColabFunctions {
    /**
     * Retrieves the current IAM policy data for runtimetemplate
     * 
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
     * import com.pulumi.gcp.colab.ColabFunctions;
     * import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
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
     *         final var policy = ColabFunctions.getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs.builder()
     *             .project(runtime_template.project())
     *             .location(runtime_template.location())
     *             .runtimeTemplate(runtime_template.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuntimeTemplateIamPolicyResult> getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs args) {
        return getRuntimeTemplateIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for runtimetemplate
     * 
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
     * import com.pulumi.gcp.colab.ColabFunctions;
     * import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
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
     *         final var policy = ColabFunctions.getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs.builder()
     *             .project(runtime_template.project())
     *             .location(runtime_template.location())
     *             .runtimeTemplate(runtime_template.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuntimeTemplateIamPolicyResult> getRuntimeTemplateIamPolicyPlain(GetRuntimeTemplateIamPolicyPlainArgs args) {
        return getRuntimeTemplateIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for runtimetemplate
     * 
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
     * import com.pulumi.gcp.colab.ColabFunctions;
     * import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
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
     *         final var policy = ColabFunctions.getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs.builder()
     *             .project(runtime_template.project())
     *             .location(runtime_template.location())
     *             .runtimeTemplate(runtime_template.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuntimeTemplateIamPolicyResult> getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:colab/getRuntimeTemplateIamPolicy:getRuntimeTemplateIamPolicy", TypeShape.of(GetRuntimeTemplateIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for runtimetemplate
     * 
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
     * import com.pulumi.gcp.colab.ColabFunctions;
     * import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
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
     *         final var policy = ColabFunctions.getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs.builder()
     *             .project(runtime_template.project())
     *             .location(runtime_template.location())
     *             .runtimeTemplate(runtime_template.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetRuntimeTemplateIamPolicyResult> getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:colab/getRuntimeTemplateIamPolicy:getRuntimeTemplateIamPolicy", TypeShape.of(GetRuntimeTemplateIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for runtimetemplate
     * 
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
     * import com.pulumi.gcp.colab.ColabFunctions;
     * import com.pulumi.gcp.colab.inputs.GetRuntimeTemplateIamPolicyArgs;
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
     *         final var policy = ColabFunctions.getRuntimeTemplateIamPolicy(GetRuntimeTemplateIamPolicyArgs.builder()
     *             .project(runtime_template.project())
     *             .location(runtime_template.location())
     *             .runtimeTemplate(runtime_template.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetRuntimeTemplateIamPolicyResult> getRuntimeTemplateIamPolicyPlain(GetRuntimeTemplateIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:colab/getRuntimeTemplateIamPolicy:getRuntimeTemplateIamPolicy", TypeShape.of(GetRuntimeTemplateIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
