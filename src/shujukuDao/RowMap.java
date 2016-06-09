package shujukuDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMap<T> {
	T build(ResultSet rs) throws SQLException;
}
