// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.billing.BudgetArgs;
import com.pulumi.gcp.billing.inputs.BudgetState;
import com.pulumi.gcp.billing.outputs.BudgetAllUpdatesRule;
import com.pulumi.gcp.billing.outputs.BudgetAmount;
import com.pulumi.gcp.billing.outputs.BudgetBudgetFilter;
import com.pulumi.gcp.billing.outputs.BudgetThresholdRule;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Budget configuration for a billing account.
 * 
 * To get more information about Budget, see:
 * 
 * * [API documentation](https://cloud.google.com/billing/docs/reference/budget/rest/v1/billingAccounts.budgets)
 * * How-to Guides
 *     * [Creating a budget](https://cloud.google.com/billing/docs/how-to/budgets)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the Billing Budgets API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ### Billing Budget Basic
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
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
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .amount(BudgetAmountArgs.builder()
 *                 .specifiedAmount(BudgetAmountSpecifiedAmountArgs.builder()
 *                     .currencyCode("USD")
 *                     .units("100000")
 *                     .build())
 *                 .build())
 *             .thresholdRules(BudgetThresholdRuleArgs.builder()
 *                 .thresholdPercent(0.5)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Billing Budget Lastperiod
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
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
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .budgetFilter(BudgetBudgetFilterArgs.builder()
 *                 .projects(String.format("projects/%s", project.number()))
 *                 .build())
 *             .amount(BudgetAmountArgs.builder()
 *                 .lastPeriodAmount(true)
 *                 .build())
 *             .thresholdRules(BudgetThresholdRuleArgs.builder()
 *                 .thresholdPercent(10.0)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Billing Budget Filter
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
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
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .budgetFilter(BudgetBudgetFilterArgs.builder()
 *                 .projects(String.format("projects/%s", project.number()))
 *                 .creditTypesTreatment("INCLUDE_SPECIFIED_CREDITS")
 *                 .services("services/24E6-581D-38E5")
 *                 .creditTypes(                
 *                     "PROMOTION",
 *                     "FREE_TIER")
 *                 .resourceAncestors("organizations/123456789")
 *                 .build())
 *             .amount(BudgetAmountArgs.builder()
 *                 .specifiedAmount(BudgetAmountSpecifiedAmountArgs.builder()
 *                     .currencyCode("USD")
 *                     .units("100000")
 *                     .build())
 *                 .build())
 *             .thresholdRules(            
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(0.5)
 *                     .build(),
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(0.9)
 *                     .spendBasis("FORECASTED_SPEND")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Billing Budget Notify
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.monitoring.NotificationChannel;
 * import com.pulumi.gcp.monitoring.NotificationChannelArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var notificationChannel = new NotificationChannel("notificationChannel", NotificationChannelArgs.builder()
 *             .displayName("Example Notification Channel")
 *             .type("email")
 *             .labels(Map.of("email_address", "address}{@literal @}{@code example.com"))
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .budgetFilter(BudgetBudgetFilterArgs.builder()
 *                 .projects(String.format("projects/%s", project.number()))
 *                 .build())
 *             .amount(BudgetAmountArgs.builder()
 *                 .specifiedAmount(BudgetAmountSpecifiedAmountArgs.builder()
 *                     .currencyCode("USD")
 *                     .units("100000")
 *                     .build())
 *                 .build())
 *             .thresholdRules(            
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(1.0)
 *                     .build(),
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(1.0)
 *                     .spendBasis("FORECASTED_SPEND")
 *                     .build())
 *             .allUpdatesRule(BudgetAllUpdatesRuleArgs.builder()
 *                 .monitoringNotificationChannels(notificationChannel.id())
 *                 .disableDefaultIamRecipients(true)
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Billing Budget Notify Project Recipient
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs;
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
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .budgetFilter(BudgetBudgetFilterArgs.builder()
 *                 .projects(String.format("projects/%s", project.number()))
 *                 .build())
 *             .amount(BudgetAmountArgs.builder()
 *                 .specifiedAmount(BudgetAmountSpecifiedAmountArgs.builder()
 *                     .currencyCode("USD")
 *                     .units("100000")
 *                     .build())
 *                 .build())
 *             .allUpdatesRule(BudgetAllUpdatesRuleArgs.builder()
 *                 .monitoringNotificationChannels()
 *                 .enableProjectLevelRecipients(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Billing Budget Customperiod
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
 * import com.pulumi.gcp.organizations.inputs.GetBillingAccountArgs;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.billing.Budget;
 * import com.pulumi.gcp.billing.BudgetArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodStartDateArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodEndDateArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
 * import com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
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
 *         final var account = OrganizationsFunctions.getBillingAccount(GetBillingAccountArgs.builder()
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var budget = new Budget("budget", BudgetArgs.builder()
 *             .billingAccount(account.id())
 *             .displayName("Example Billing Budget")
 *             .budgetFilter(BudgetBudgetFilterArgs.builder()
 *                 .projects(String.format("projects/%s", project.number()))
 *                 .creditTypesTreatment("EXCLUDE_ALL_CREDITS")
 *                 .services("services/24E6-581D-38E5")
 *                 .customPeriod(BudgetBudgetFilterCustomPeriodArgs.builder()
 *                     .startDate(BudgetBudgetFilterCustomPeriodStartDateArgs.builder()
 *                         .year(2022)
 *                         .month(1)
 *                         .day(1)
 *                         .build())
 *                     .endDate(BudgetBudgetFilterCustomPeriodEndDateArgs.builder()
 *                         .year(2023)
 *                         .month(12)
 *                         .day(31)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .amount(BudgetAmountArgs.builder()
 *                 .specifiedAmount(BudgetAmountSpecifiedAmountArgs.builder()
 *                     .currencyCode("USD")
 *                     .units("100000")
 *                     .build())
 *                 .build())
 *             .thresholdRules(            
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(0.5)
 *                     .build(),
 *                 BudgetThresholdRuleArgs.builder()
 *                     .thresholdPercent(0.9)
 *                     .build())
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
 * Budget can be imported using any of these accepted formats:
 * 
 * * `billingAccounts/{{billing_account}}/budgets/{{name}}`
 * 
 * * `{{billing_account}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Budget can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:billing/budget:Budget default billingAccounts/{{billing_account}}/budgets/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:billing/budget:Budget default {{billing_account}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:billing/budget:Budget default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:billing/budget:Budget")
public class Budget extends com.pulumi.resources.CustomResource {
    /**
     * Defines notifications that are sent on every update to the
     * billing account&#39;s spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    @Export(name="allUpdatesRule", refs={BudgetAllUpdatesRule.class}, tree="[0]")
    private Output</* @Nullable */ BudgetAllUpdatesRule> allUpdatesRule;

    /**
     * @return Defines notifications that are sent on every update to the
     * billing account&#39;s spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    public Output<Optional<BudgetAllUpdatesRule>> allUpdatesRule() {
        return Codegen.optional(this.allUpdatesRule);
    }
    /**
     * The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    @Export(name="amount", refs={BudgetAmount.class}, tree="[0]")
    private Output<BudgetAmount> amount;

    /**
     * @return The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    public Output<BudgetAmount> amount() {
        return this.amount;
    }
    /**
     * ID of the billing account to set a budget on.
     * 
     */
    @Export(name="billingAccount", refs={String.class}, tree="[0]")
    private Output<String> billingAccount;

    /**
     * @return ID of the billing account to set a budget on.
     * 
     */
    public Output<String> billingAccount() {
        return this.billingAccount;
    }
    /**
     * Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    @Export(name="budgetFilter", refs={BudgetBudgetFilter.class}, tree="[0]")
    private Output<BudgetBudgetFilter> budgetFilter;

    /**
     * @return Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    public Output<BudgetBudgetFilter> budgetFilter() {
        return this.budgetFilter;
    }
    /**
     * User data for display name in UI. Must be &lt;= 60 chars.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User data for display name in UI. Must be &lt;= 60 chars.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Resource name of the budget. The resource name
     * implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Resource name of the budget. The resource name
     * implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ownership scope of the budget. The ownership scope and users&#39;
     * IAM permissions determine who has full access to the budget&#39;s data.
     * Possible values are: `OWNERSHIP_SCOPE_UNSPECIFIED`, `ALL_USERS`, `BILLING_ACCOUNT`.
     * 
     */
    @Export(name="ownershipScope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownershipScope;

    /**
     * @return The ownership scope of the budget. The ownership scope and users&#39;
     * IAM permissions determine who has full access to the budget&#39;s data.
     * Possible values are: `OWNERSHIP_SCOPE_UNSPECIFIED`, `ALL_USERS`, `BILLING_ACCOUNT`.
     * 
     */
    public Output<Optional<String>> ownershipScope() {
        return Codegen.optional(this.ownershipScope);
    }
    /**
     * Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    @Export(name="thresholdRules", refs={List.class,BudgetThresholdRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BudgetThresholdRule>> thresholdRules;

    /**
     * @return Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<BudgetThresholdRule>>> thresholdRules() {
        return Codegen.optional(this.thresholdRules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Budget(java.lang.String name) {
        this(name, BudgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Budget(java.lang.String name, BudgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Budget(java.lang.String name, BudgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Budget(java.lang.String name, Output<java.lang.String> id, @Nullable BudgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, state, makeResourceOptions(options, id), false);
    }

    private static BudgetArgs makeArgs(BudgetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BudgetArgs.Empty : args;
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
    public static Budget get(java.lang.String name, Output<java.lang.String> id, @Nullable BudgetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Budget(name, id, state, options);
    }
}
