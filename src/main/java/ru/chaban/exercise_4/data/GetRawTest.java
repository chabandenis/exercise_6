package ru.chaban.exercise_4.data;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class GetRawTest implements GetRawsInterface {
    @Override
    public List<RawInFile> get() {
        List<RawInFile> rawInFiles = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                String[] spl = line.split("#");

                RawInFile logins1 = new RawInFile();
                logins1.setId(Integer.valueOf(spl[0]));
                logins1.setApplication(spl[1]);
                logins1.setAccess_date(LocalDate.parse(spl[2]));
                logins1.setUsername(spl[3]);
                logins1.setId_user(Integer.valueOf(spl[4]));
                logins1.setFio(spl[5]);
                logins1.setId_user(Integer.valueOf(spl[6]));
                logins1.setUserId(Integer.valueOf(spl[7]));
                rawInFiles.add(logins1);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rawInFiles;
    }

    ;
}
