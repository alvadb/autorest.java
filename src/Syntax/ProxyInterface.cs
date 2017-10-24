using System.Collections.Immutable;

namespace AutoRest.Java.Syntax
{
    /// <summary>
    /// Represents a Java interface which is used by RestProxy to make REST calls.
    /// </summary>
    public sealed class ProxyInterface
    {
        public ImmutableArray<ProxyMethod> Methods { get; }

        public string Name { get; }

        public ProxyInterface(ImmutableArray<ProxyMethod> methods, string name)
        {
            Methods = methods;
            Name = name;
        }
    }
}