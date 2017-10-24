using System.Collections.Immutable;

namespace AutoRest.Java.Syntax
{
    /// <summary>
    /// Represents a single Java method which calls a service method.
    /// </summary>
    public sealed class OperationMethod
    {
        public string ReturnTypeName { get; }

        public string ReturnTypeJavadoc { get; }

        public string Name { get; }

        public ImmutableArray<OperationParameter> Parameters { get; }

        public string SummaryJavadoc { get; }

        public string DescriptionJavadoc { get; }

        public ImmutableArray<string> ExceptionJavadocs { get; }

        /// <summary>
        /// The method's implementation, not including the enclosing curly braces.
        /// </summary>
        public string Implementation { get; }

        public OperationMethod(
            string returnTypeName,
            string returnTypeJavadoc,
            string name,
            ImmutableArray<OperationParameter> parameters,
            string summaryJavadoc,
            string descriptionJavadoc,
            ImmutableArray<string> exceptionJavadocs,
            string implementation)
        {
            ReturnTypeName = returnTypeName;
            ReturnTypeJavadoc = returnTypeJavadoc;
            Name = name;
            Parameters = parameters;
            SummaryJavadoc = summaryJavadoc;
            DescriptionJavadoc = descriptionJavadoc;
            ExceptionJavadocs = exceptionJavadocs;
            Implementation = implementation;
        }
    }
}