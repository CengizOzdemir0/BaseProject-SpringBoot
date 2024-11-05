package com.cengiz.baseproject.modules.auth.controller;


import com.cengiz.baseproject.base.dto.TokenDto;
import com.cengiz.baseproject.config.domain.ResponseHelper;
import com.cengiz.baseproject.config.domain.RestResponse;
import com.cengiz.baseproject.modules.auth.dto.KullaniciLoginDto;
import com.cengiz.baseproject.modules.auth.service.KullaniciLoginService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/vatandas/auth")
public class KullaniciLoginController {

   private final KullaniciLoginService kullaniciLoginService;

    @PostMapping("/login")
    public ResponseEntity<RestResponse<TokenDto>> login(@RequestBody @Valid KullaniciLoginDto loginDto) {
        return ResponseHelper.responseEntityFromResponse(kullaniciLoginService.login(loginDto));
    }



}
