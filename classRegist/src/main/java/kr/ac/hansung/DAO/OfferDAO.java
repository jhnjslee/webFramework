package kr.ac.hansung.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

@Repository
public class OfferDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(javax.sql.DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	public Offer getOffers(String name) {
		String sqlStatement = "select * from offers where name=?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] {name},
				new RowMapper<Offer>() {
					public Offer mapRow(ResultSet rs,int rowNum) throws SQLException{
						Offer offer = new Offer();
						offer.setClassname(rs.getString("classname"));
						offer.setCodenumber(rs.getString("codenumber"));
						offer.setDivision(rs.getString("division"));
						offer.setEx(rs.getString("ex"));
						offer.setPoint(rs.getString("point"));
						offer.setYear(rs.getString("year"));
					
						return offer;
					}
		});
	}
	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {
					public Offer mapRow(ResultSet rs,int rowNum) throws SQLException{
						Offer offer = new Offer();
						offer.setClassname(rs.getString("classname"));
						offer.setCodenumber(rs.getString("codenumber"));
						offer.setDivision(rs.getString("division"));
						offer.setEx(rs.getString("ex"));
						offer.setPoint(rs.getString("point"));
						offer.setYear(rs.getString("year"));
					
						return offer;
					}
		});
	}

	public List<Offer> getCurrentOffers() {
		String sqlStatement = "select * from offers Where year = 2019 AND division = 1";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {
					public Offer mapRow(ResultSet rs,int rowNum) throws SQLException{
						Offer offer = new Offer();
						offer.setClassname(rs.getString("classname"));
						offer.setCodenumber(rs.getString("codenumber"));
						offer.setDivision(rs.getString("division"));
						offer.setEx(rs.getString("ex"));
						offer.setPoint(rs.getString("point"));
						offer.setYear(rs.getString("year"));
					
						return offer;
					}
		});
	}
	public boolean insert(Offer offer) {
		String year="2019";
		String classname=offer.getClassname();
		String codenumber=offer.getCodenumber();
		String division = "1";
		String ex = offer.getEx();
		String point = offer.getPoint();
		
		String sqlStatement = "insert into offers (year,division,codenumber,classname,ex,point) values (?,?,?,?,?,?)";
		return true;//(jdbcTemplate.update(sqlStatement,new Object[]{year,division,codenumber,classname,ex,point}) == 1);
	}
	
	public boolean update(Offer offer) {
		String year=offer.getYear();
		String classname=offer.getClassname();
		String codenumber=offer.getCodenumber();
		String division = offer.getDivision();
		String ex = offer.getEx();
		String point = offer.getPoint();
		
		String sqlStatement = "update offers set year=?, division = ?,codenumber = ?,classname = ?,ex = ?,point = ?";
		
		return true;//(jdbcTemplate.update(sqlStatement,new Object[]{year,division,codenumber,classname,ex,point}) == 1);
	}
	
	public boolean delete(String classname) {
		
		String sqlStatement = "delete from offers where classname=?";
		
		return true;//(jdbcTemplate.update(sqlStatement, new Object[] {classname}) == 1);
	}
	
}
