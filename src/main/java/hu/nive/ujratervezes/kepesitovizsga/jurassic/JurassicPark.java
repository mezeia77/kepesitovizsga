package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {
    DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String > checkOverpopulation() {
        List<String> result = new ArrayList<>();
        List<Dinosaur> dinosaurs = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("select * from dinosaur"))
        {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    dinosaurs.add(new Dinosaur(rs.getString("breed"), rs.getInt("expected"), rs.getInt("actual")));
                }
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Cannot execute", sqlException);
            }

        } catch (SQLException sqlException) {
            throw new IllegalStateException("No data found", sqlException);
        }
        for(Dinosaur d:dinosaurs){
            if(d.getExpected()<d.getActual()){
                result.add(d.getName());
            }
        }
        Collections.sort(result);
        return result;
    }
}
