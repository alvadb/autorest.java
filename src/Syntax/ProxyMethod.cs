using System.Collections.Immutable;

namespace AutoRest.Java.Syntax
{
    /// <summary>
    /// Represents a method on an Java interface used to make a REST call.
    /// </summary>
    public sealed class ProxyMethod
    {
        /// <summary>
        /// The Java annotations decorating this method.
        /// </summary>
        public ImmutableArray<string> Annotations { get; }

        public string SummaryDocumentation { get; }

        public string ReturnType { get; }

        public string ReturnTypeDocumentation { get; }

        public string Name { get; }

        public ImmutableArray<string> ExceptionsDocumentation { get; }

        public ImmutableArray<OperationParameter> Parameters { get; }

        public ProxyMethod(ImmutableArray<string> annotations,
            string summaryDocumentation,
            string returnType,
            string returnTypeDocumentation,
            string name,
            ImmutableArray<string> exceptionsDocumentation,
            ImmutableArray<OperationParameter> parameters)
        {
            Annotations = annotations;
            SummaryDocumentation = summaryDocumentation;
            ReturnType = returnType;
            ReturnTypeDocumentation = returnTypeDocumentation;
            Name = name;
            ExceptionsDocumentation = exceptionsDocumentation;
            Parameters = parameters;
        }
    }
}
