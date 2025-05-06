import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.IOException;

public class JsonTypeHandler<T> extends BaseTypeHandler<T> {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<T> type;

    public JsonTypeHandler(Class<T> type) {
        this.type = type;
    }

    @Override
    public void setNonNullParameter(java.sql.PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws java.sql.SQLException {
        try {
            ps.setString(i, objectMapper.writeValueAsString(parameter));
        } catch (IOException e) {
            throw new java.sql.SQLException("Could not write JSON", e);
        }
    }

    @Override
    public T getNullableResult(java.sql.ResultSet rs, String columnName) throws java.sql.SQLException {
        try {
            String json = rs.getString(columnName);
            return json == null ? null : objectMapper.readValue(json, type);
        } catch (IOException e) {
            throw new java.sql.SQLException("Could not read JSON", e);
        }
    }

    @Override
    public T getNullableResult(java.sql.ResultSet rs, int columnIndex) throws java.sql.SQLException {
        try {
            String json = rs.getString(columnIndex);
            return json == null ? null : objectMapper.readValue(json, type);
        } catch (IOException e) {
            throw new java.sql.SQLException("Could not read JSON", e);
        }
    }

    @Override
    public T getNullableResult(java.sql.CallableStatement cs, int columnIndex) throws java.sql.SQLException {
        try {
            String json = cs.getString(columnIndex);
            return json == null ? null : objectMapper.readValue(json, type);
        } catch (IOException e) {
            throw new java.sql.SQLException("Could not read JSON", e);
        }
    }
}
