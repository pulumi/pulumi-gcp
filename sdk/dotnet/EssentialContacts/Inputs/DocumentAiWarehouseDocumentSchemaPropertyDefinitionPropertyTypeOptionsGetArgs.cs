// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EssentialContacts.Inputs
{

    public sealed class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("propertyDefinitions", required: true)]
        private InputList<Inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionGetArgs>? _propertyDefinitions;

        /// <summary>
        /// Defines the metadata for a schema property.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionGetArgs> PropertyDefinitions
        {
            get => _propertyDefinitions ?? (_propertyDefinitions = new InputList<Inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionGetArgs>());
            set => _propertyDefinitions = value;
        }

        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsGetArgs()
        {
        }
        public static new DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsGetArgs Empty => new DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsGetArgs();
    }
}