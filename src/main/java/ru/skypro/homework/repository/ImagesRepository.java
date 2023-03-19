package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.entity.Images;

public interface ImagesRepository extends JpaRepository<Images, Long> {

    Images findAllByAdsId(long adsId);
    void deleteAllByAdsId(long adsId);
}