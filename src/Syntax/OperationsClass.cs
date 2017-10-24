using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Text;

namespace AutoRest.Java.Syntax
{
    /// <summary>
    /// Represents a Java class which implements a set of service operations.
    /// </summary>
    public sealed class OperationsClass
    {
        public string ClassName { get; }
        public ImmutableArray<string> Imports { get; }
        public string ServiceClientClassName { get; }
        public ProxyInterface ServiceInterface { get; }
        public ImmutableArray<OperationMethod> Methods { get; }

        public OperationsClass(
            string className,
            ImmutableArray<string> imports,
            string serviceClientClassName,
            ProxyInterface serviceInterface,
            ImmutableArray<OperationMethod> methods)
        {
            ClassName = className;
            Imports = imports;
            ServiceClientClassName = serviceClientClassName;
            ServiceInterface = serviceInterface;
            Methods = methods;
        }
    }
}
