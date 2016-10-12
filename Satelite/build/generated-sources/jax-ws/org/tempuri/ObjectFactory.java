
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarUsuarioUsuario_QNAME = new QName("http://tempuri.org/", "usuario");
    private final static QName _ValidarUsuarioContrasena_QNAME = new QName("http://tempuri.org/", "contrasena");
    private final static QName _ValidarUsuarioResponseValidarUsuarioResult_QNAME = new QName("http://tempuri.org/", "ValidarUsuarioResult");
    private final static QName _RecuperarUsuarioRun_QNAME = new QName("http://tempuri.org/", "run");
    private final static QName _RecuperarUsuarioResponseRecuperarUsuarioResult_QNAME = new QName("http://tempuri.org/", "RecuperarUsuarioResult");
    private final static QName _RegistrarUsuarioResponseRegistrarUsuarioResult_QNAME = new QName("http://tempuri.org/", "RegistrarUsuarioResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RecuperarUsuario }
     * 
     */
    public RecuperarUsuario createRecuperarUsuario() {
        return new RecuperarUsuario();
    }

    /**
     * Create an instance of {@link RecuperarUsuarioResponse }
     * 
     */
    public RecuperarUsuarioResponse createRecuperarUsuarioResponse() {
        return new RecuperarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuario", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioUsuario(String value) {
        return new JAXBElement<String>(_ValidarUsuarioUsuario_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contrasena", scope = ValidarUsuario.class)
    public JAXBElement<String> createValidarUsuarioContrasena(String value) {
        return new JAXBElement<String>(_ValidarUsuarioContrasena_QNAME, String.class, ValidarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidarUsuarioResult", scope = ValidarUsuarioResponse.class)
    public JAXBElement<String> createValidarUsuarioResponseValidarUsuarioResult(String value) {
        return new JAXBElement<String>(_ValidarUsuarioResponseValidarUsuarioResult_QNAME, String.class, ValidarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "run", scope = RecuperarUsuario.class)
    public JAXBElement<String> createRecuperarUsuarioRun(String value) {
        return new JAXBElement<String>(_RecuperarUsuarioRun_QNAME, String.class, RecuperarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecuperarUsuarioResult", scope = RecuperarUsuarioResponse.class)
    public JAXBElement<String> createRecuperarUsuarioResponseRecuperarUsuarioResult(String value) {
        return new JAXBElement<String>(_RecuperarUsuarioResponseRecuperarUsuarioResult_QNAME, String.class, RecuperarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuario", scope = RegistrarUsuario.class)
    public JAXBElement<String> createRegistrarUsuarioUsuario(String value) {
        return new JAXBElement<String>(_ValidarUsuarioUsuario_QNAME, String.class, RegistrarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrarUsuarioResult", scope = RegistrarUsuarioResponse.class)
    public JAXBElement<String> createRegistrarUsuarioResponseRegistrarUsuarioResult(String value) {
        return new JAXBElement<String>(_RegistrarUsuarioResponseRegistrarUsuarioResult_QNAME, String.class, RegistrarUsuarioResponse.class, value);
    }

}
