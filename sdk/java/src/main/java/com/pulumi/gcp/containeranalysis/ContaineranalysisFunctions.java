// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyPlainArgs;
import com.pulumi.gcp.containeranalysis.outputs.GetNoteIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class ContaineranalysisFunctions {
    /**
     * Retrieves the current IAM policy data for note
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
     * import com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions;
     * import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
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
     *         final var policy = ContaineranalysisFunctions.getNoteIamPolicy(GetNoteIamPolicyArgs.builder()
     *             .project(note.project())
     *             .note(note.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNoteIamPolicyResult> getNoteIamPolicy(GetNoteIamPolicyArgs args) {
        return getNoteIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for note
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
     * import com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions;
     * import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
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
     *         final var policy = ContaineranalysisFunctions.getNoteIamPolicy(GetNoteIamPolicyArgs.builder()
     *             .project(note.project())
     *             .note(note.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNoteIamPolicyResult> getNoteIamPolicyPlain(GetNoteIamPolicyPlainArgs args) {
        return getNoteIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves the current IAM policy data for note
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
     * import com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions;
     * import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
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
     *         final var policy = ContaineranalysisFunctions.getNoteIamPolicy(GetNoteIamPolicyArgs.builder()
     *             .project(note.project())
     *             .note(note.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNoteIamPolicyResult> getNoteIamPolicy(GetNoteIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:containeranalysis/getNoteIamPolicy:getNoteIamPolicy", TypeShape.of(GetNoteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for note
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
     * import com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions;
     * import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
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
     *         final var policy = ContaineranalysisFunctions.getNoteIamPolicy(GetNoteIamPolicyArgs.builder()
     *             .project(note.project())
     *             .note(note.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNoteIamPolicyResult> getNoteIamPolicy(GetNoteIamPolicyArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("gcp:containeranalysis/getNoteIamPolicy:getNoteIamPolicy", TypeShape.of(GetNoteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves the current IAM policy data for note
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
     * import com.pulumi.gcp.containeranalysis.ContaineranalysisFunctions;
     * import com.pulumi.gcp.containeranalysis.inputs.GetNoteIamPolicyArgs;
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
     *         final var policy = ContaineranalysisFunctions.getNoteIamPolicy(GetNoteIamPolicyArgs.builder()
     *             .project(note.project())
     *             .note(note.name())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNoteIamPolicyResult> getNoteIamPolicyPlain(GetNoteIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:containeranalysis/getNoteIamPolicy:getNoteIamPolicy", TypeShape.of(GetNoteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
