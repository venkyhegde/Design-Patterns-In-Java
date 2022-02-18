package io.github.venkyhegde.dip;

public interface DBConnection {
    int connect();
}

class MySQLConnection implements DBConnection{
    @Override
    public int connect() {
        return 1;
    }
}
