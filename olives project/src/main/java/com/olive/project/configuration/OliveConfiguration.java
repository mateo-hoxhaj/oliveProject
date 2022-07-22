package com.olive.project.configuration;

import com.olive.project.model.Fertilizing;
import com.olive.project.model.Olive;
import com.olive.project.model.OliveForm;
import com.olive.project.model.Working;
import com.olive.project.repository.FertilizerRepository;
import com.olive.project.repository.OliveFormRepository;
import com.olive.project.repository.OliveRepository;
import com.olive.project.repository.WorkingRepository;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Configuration
public class OliveConfiguration {

    @Bean
    @Cascade(CascadeType.ALL)
    CommandLineRunner initDatabase(OliveRepository oliveRepository, FertilizerRepository fertilizerRepository, WorkingRepository workingRepository, OliveFormRepository oliveFormRepository) {

        return args -> {
            Olive Kaninioti = new Olive("Kaninioti",
                    LocalDate.of(2000, 02, 20),
                    22,
                    "Autokton",
                    "Salt&Oil",
                    65.0,
                    25.0,
                    "ExtraVirgine",
                    150.0,
                    800.0);

            Olive Berati = new Olive("Berati",
                    LocalDate.of(2001, 01, 20),
                    21,
                    "Autokton",
                    "Salt&Oil",
                    60.0,
                    22.0,
                    "Virgine",
                    100.0,
                    700.0);

            oliveRepository.saveAll(List.of(Kaninioti, Berati));

                Fertilizing LlojSoj = new Fertilizing(1L,
                        "LlojSoj",
                        "AshtuKshu",
                        new Date(02/02/2020),
                        Kaninioti);

                Fertilizing Pleh = new Fertilizing(1L,
                        "LlojSoj",
                        "AshtuKshu",
                        new Date(02/02/2020),
                        Berati);


                fertilizerRepository.saveAll(List.of(LlojSoj, Pleh));


                Working workingKaninioti= new Working(1L, "me bel", "manuale",new Date(02/02/2020), Kaninioti);
                Working workingBerati= new Working(2L, "me bel", "manuale",new Date(02/02/2020), Berati);

            workingRepository.saveAll(List.of(workingKaninioti, workingBerati));

            OliveForm formKaninioti= new OliveForm(1L, "kokerr", Kaninioti);
            OliveForm formBerati= new OliveForm(2L, "shtypur", Berati );


            oliveFormRepository.saveAll(List.of(formKaninioti, formBerati));



        };
        }
}
