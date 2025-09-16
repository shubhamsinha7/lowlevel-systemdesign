package DesignPattern.structuralDesignPattern.CompositeDesignPattern;

final class FileLeaf implements Component{
    private final String name;
    private final long bytes;

    FileLeaf(String name, long bytes) {
        this.name = name;
        this.bytes = bytes;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public long size() {
        return bytes;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- "+name+ " (" + bytes + "B )");
    }
}
