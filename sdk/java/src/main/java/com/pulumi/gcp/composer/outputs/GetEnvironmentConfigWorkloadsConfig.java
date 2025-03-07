// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigDagProcessor;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigScheduler;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigTriggerer;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWebServer;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWorker;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigWorkloadsConfig {
    /**
     * @return Configuration for resources used by DAG processor.
     * 
     */
    private List<GetEnvironmentConfigWorkloadsConfigDagProcessor> dagProcessors;
    /**
     * @return Configuration for resources used by Airflow schedulers.
     * 
     */
    private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
    /**
     * @return Configuration for resources used by Airflow triggerers.
     * 
     */
    private List<GetEnvironmentConfigWorkloadsConfigTriggerer> triggerers;
    /**
     * @return Configuration for resources used by Airflow web server.
     * 
     */
    private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
    /**
     * @return Configuration for resources used by Airflow workers.
     * 
     */
    private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

    private GetEnvironmentConfigWorkloadsConfig() {}
    /**
     * @return Configuration for resources used by DAG processor.
     * 
     */
    public List<GetEnvironmentConfigWorkloadsConfigDagProcessor> dagProcessors() {
        return this.dagProcessors;
    }
    /**
     * @return Configuration for resources used by Airflow schedulers.
     * 
     */
    public List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers() {
        return this.schedulers;
    }
    /**
     * @return Configuration for resources used by Airflow triggerers.
     * 
     */
    public List<GetEnvironmentConfigWorkloadsConfigTriggerer> triggerers() {
        return this.triggerers;
    }
    /**
     * @return Configuration for resources used by Airflow web server.
     * 
     */
    public List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers() {
        return this.webServers;
    }
    /**
     * @return Configuration for resources used by Airflow workers.
     * 
     */
    public List<GetEnvironmentConfigWorkloadsConfigWorker> workers() {
        return this.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEnvironmentConfigWorkloadsConfigDagProcessor> dagProcessors;
        private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
        private List<GetEnvironmentConfigWorkloadsConfigTriggerer> triggerers;
        private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
        private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;
        public Builder() {}
        public Builder(GetEnvironmentConfigWorkloadsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagProcessors = defaults.dagProcessors;
    	      this.schedulers = defaults.schedulers;
    	      this.triggerers = defaults.triggerers;
    	      this.webServers = defaults.webServers;
    	      this.workers = defaults.workers;
        }

        @CustomType.Setter
        public Builder dagProcessors(List<GetEnvironmentConfigWorkloadsConfigDagProcessor> dagProcessors) {
            if (dagProcessors == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigWorkloadsConfig", "dagProcessors");
            }
            this.dagProcessors = dagProcessors;
            return this;
        }
        public Builder dagProcessors(GetEnvironmentConfigWorkloadsConfigDagProcessor... dagProcessors) {
            return dagProcessors(List.of(dagProcessors));
        }
        @CustomType.Setter
        public Builder schedulers(List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers) {
            if (schedulers == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigWorkloadsConfig", "schedulers");
            }
            this.schedulers = schedulers;
            return this;
        }
        public Builder schedulers(GetEnvironmentConfigWorkloadsConfigScheduler... schedulers) {
            return schedulers(List.of(schedulers));
        }
        @CustomType.Setter
        public Builder triggerers(List<GetEnvironmentConfigWorkloadsConfigTriggerer> triggerers) {
            if (triggerers == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigWorkloadsConfig", "triggerers");
            }
            this.triggerers = triggerers;
            return this;
        }
        public Builder triggerers(GetEnvironmentConfigWorkloadsConfigTriggerer... triggerers) {
            return triggerers(List.of(triggerers));
        }
        @CustomType.Setter
        public Builder webServers(List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers) {
            if (webServers == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigWorkloadsConfig", "webServers");
            }
            this.webServers = webServers;
            return this;
        }
        public Builder webServers(GetEnvironmentConfigWorkloadsConfigWebServer... webServers) {
            return webServers(List.of(webServers));
        }
        @CustomType.Setter
        public Builder workers(List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
            if (workers == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigWorkloadsConfig", "workers");
            }
            this.workers = workers;
            return this;
        }
        public Builder workers(GetEnvironmentConfigWorkloadsConfigWorker... workers) {
            return workers(List.of(workers));
        }
        public GetEnvironmentConfigWorkloadsConfig build() {
            final var _resultValue = new GetEnvironmentConfigWorkloadsConfig();
            _resultValue.dagProcessors = dagProcessors;
            _resultValue.schedulers = schedulers;
            _resultValue.triggerers = triggerers;
            _resultValue.webServers = webServers;
            _resultValue.workers = workers;
            return _resultValue;
        }
    }
}
