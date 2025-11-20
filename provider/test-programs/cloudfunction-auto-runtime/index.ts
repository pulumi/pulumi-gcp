import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

// Extract expected runtime from current Node.js version
const majorVersion = process.version.slice(1).split('.')[0];
const expectedRuntimeValue = `nodejs${majorVersion}`;

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
