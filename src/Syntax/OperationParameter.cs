using System.Collections.Immutable;

namespace AutoRest.Java.Syntax
{
    /// <summary>
    /// Represents a parameter to a Java method.
    /// </summary>
    public sealed class OperationParameter
    {
        public string Type { get; }
        public string Name { get; }
        public string Javadoc { get; }

        public OperationParameter(string type, string name, string javadoc)
        {
            Type = type;
            Name = name;
            Javadoc = javadoc;
        }
    }
}
