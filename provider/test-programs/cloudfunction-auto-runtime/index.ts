import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

// Extract expected runtime from current Node.js version
const majorVersion = process.version.slice(1).split('.')[0];
const expectedRuntimeValue = `nodejs${majorVersion}`;

pulumi.log.error(`Expected runtime: ${expectedRuntimeValue}`);
pulumi.log.error(`Current Node.js version: ${process.version}`);

throw new Error(`Expected runtime: ${expectedRuntimeValue} / Current Node.js version: ${process.version}`);

// Create a CallbackFunction WITHOUT specifying runtime
// It should automatically use the current Node.js version
const fn = new gcp.cloudfunctions.CallbackFunction("auto-runtime-test", {
    // NOTE: runtime is NOT specified - should auto-detect
    callback: (req: any, res: any) => {
        res.send("Hello from auto-detected runtime!");
    },
    triggerHttp: true,
});

// Export outputs for test verification
export const functionRuntime = fn.function.runtime;
export const expectedRuntime = expectedRuntimeValue;
export const currentNodeVersion = process.version;
