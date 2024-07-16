package br.com.debora.screenmatch_web.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
