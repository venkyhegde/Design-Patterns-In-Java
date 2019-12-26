package edu.uncc.dip;

public interface DBConnection {
    int connect();
}

class MySQLConnection implements DBConnection{
    @Override
    public int connect() {
        return 1;
    }
}
