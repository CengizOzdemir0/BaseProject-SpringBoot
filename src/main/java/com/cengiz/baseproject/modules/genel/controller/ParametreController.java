package com.cengiz.baseproject.modules.genel.controller;


import com.cengiz.baseproject.base.dto.wrapper.BooleanWrapper;
import com.cengiz.baseproject.config.domain.ResponseHelper;
import com.cengiz.baseproject.config.domain.RestResponse;
import com.cengiz.baseproject.modules.genel.data.ParametreObject;
import com.cengiz.baseproject.modules.genel.data.dto.ParametreDto;
import com.cengiz.baseproject.modules.genel.enums.Parametreler;
import com.cengiz.baseproject.modules.genel.service.ParametreService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cengiz ÖZDEMİR
 * @created 09/03/2024 - 22:08
 */

@RestController
@RequestMapping("/parametreler")
@RequiredArgsConstructor
public class ParametreController {

  private final ParametreService parametreService;



  @GetMapping("/{id}")
  public ResponseEntity<RestResponse<ParametreDto>> getById(
      @PathVariable(value = "id") @NotNull Integer id) {
    return ResponseHelper.responseEntityOkFromData(parametreService.getById(id));
  }



  @GetMapping
  public ResponseEntity<RestResponse<ParametreDto>> getAll() {
    return ResponseHelper.responseEntityOkFromListData(parametreService.getAll());
  }


  @PostMapping
  public ResponseEntity<RestResponse<ParametreDto>> save(@Valid @RequestBody ParametreDto data) {
    return ResponseHelper.responseEntityOkFromData(parametreService.save(data));
  }


  @PutMapping("/{id}")
  public ResponseEntity<RestResponse<ParametreDto>> update(
      @PathVariable(value = "id") @NotNull Integer id, @Valid @RequestBody ParametreDto data) {
    return ResponseHelper.responseEntityOkFromData(parametreService.update(id, data));
  }



  @DeleteMapping("/{id}")
  public ResponseEntity<RestResponse<BooleanWrapper>> delete(
      @PathVariable(value = "id") @NotNull Integer id, @Valid @RequestBody ParametreDto data) {
    return ResponseHelper.responseEntityOkFromData(parametreService.delete(id, data));
  }

  @GetMapping("/degeri/{parametreAdi}")
  public ResponseEntity<RestResponse<ParametreObject>> getParametre(@NotNull @PathVariable("parametreAdi")
  String parametreAdi) {
    return ResponseHelper.responseEntityOkFromData(ParametreObject.builder()
        .value(parametreService.getParametre(Parametreler.of(parametreAdi)))
        .build());
  }
}
