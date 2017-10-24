using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Text;

namespace AutoRest.Java.Syntax
{
    public sealed class ProxyParameter
    {
        public ImmutableArray<string> Annotations { get; }
        public string Type { get; }
        public string Name { get; }

        public ProxyParameter(ImmutableArray<string> annotations, string type, string name)
        {
            Annotations = annotations;
            Type = type;
            Name = name;
        }
    }
}
