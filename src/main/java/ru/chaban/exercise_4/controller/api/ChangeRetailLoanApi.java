package ru.chaban.exercise_4.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import ru.chaban.exercise_4.request.RequestDto;
import ru.chaban.exercise_4.response.ResponseDto;

public interface ChangeRetailLoanApi {

    @PostMapping(value = "/plan-condition-arrangement/change", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(summary = "Сохранение актуальных условий планирования для графика платежей экземпляра продукта", description = "Метод сохранения актуальных условий планирования для графика платежей экземпляра продукта", responses = {@ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ResponseDto.class))), @ApiResponse(responseCode = "400", description = "Bad Request"), @ApiResponse(responseCode = "404", description = "Not Found"), @ApiResponse(responseCode = "422", description = "Unprocessable Entity")})
    ResponseDto changeArrangementPlanCondition(@RequestBody @Valid RequestDto request);

}
