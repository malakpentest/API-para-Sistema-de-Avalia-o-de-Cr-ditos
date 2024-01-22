package me.dio.credit.application.system.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded
import org.aspectj.apache.bcel.classfile.Code

@Embeddable
data class Address (
    @Column(nullable = false) var zipCode: String = "",
    @Column(nullable = false) var street: String = ""
)
