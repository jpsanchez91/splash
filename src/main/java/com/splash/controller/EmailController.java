package com.splash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.splash.entity.EmailEntity;

@RestController
public class EmailController {

	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public HttpStatus sendEmail(@RequestBody EmailEntity email) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("joao@deliverynet.com");
		message.setTo(email.Email);
		message.setSubject("Bem vindo ao deliveryNet");
		message.setText("Ola " + email.Nome
				+ " bem vindo deliveryNet Muito Obrigado por se inscrever no deliveryNet manteremos você informado de qualquer novidade no aplicativo. Agora precisamos da sua ajuda, por favor resposta as 3 perguntas nesse link http://localhost:8080/resposta.html?nome="
				+ email.Nome + "&email=" + email.Email + " . E aproveite o novo jeito de saborear a vida ");
		mailSender.send(message);
		return HttpStatus.OK;
	}

}
