export declare function getEnv(...vars: string[]): string | undefined;
export declare function getEnvBoolean(...vars: string[]): boolean | undefined;
export declare function getEnvNumber(...vars: string[]): number | undefined;
export declare function requireWithDefault<T>(req: () => T, def: T | undefined): T;
