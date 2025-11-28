function validarForm(){
    const nombre = document.getElementById('nombre');
    const apellidos = document.getElementById('apellidos');
    const fNacimiento = document.getElementById('fechaNacimiento');
    const genero = document.getElementById('genero');
    const nacionalidad = document.getElementById('nacionalidad');
    const identificacion = document.getElementById('identificacion');
    const nIdentificacion = document.getElementById('nIdentificacion');
    const estadoCivil = document.getElementById('estCivil');
    const telefonoMovil = document.getElementById('tlfmovil');
    const telefonoFijo = document.getElementById('tlffijo');
    const email = document.getElementById('email');
    const linkedin = document.getElementById('linkedin');
    const twitter = document.getElementById('twitter');
    const web = document.getElementById('web');


    validarNombre(nombre);
    validarApellidos(apellidos);
    validarFNacimiento(fNacimiento);
    validarGenero(genero);
    validarNacionalidad(nacionalidad);
    validarIdentificacion(identificacion);
    validarNIdentifiacion(nIdentificacion);
    validarEstadoCivil(estadoCivil);
    validarTelefonoMovil(telefonoMovil);
    validarTelefonoFijo(telefonoFijo);
    validarEmail(email);
    validarLinkedin(linkedin);
    validarTwitter(twitter);
    validarWeb(web);
}

function validarNombre(nombre){
    validarCampoObligatorio(nombre);
    validarTamano(nombre);
}

function validarApellidos(apellidos){
    validarCampoObligatorio(apellidos);
        validarTamano(apellidos);

}
function validarFNacimiento(fNacimiento){
    validarCampoObligatorio(fNacimiento)
        validarTamano(fNacimiento);

}
function validarGenero(genero){
validarSelect(genero);
}
function validarNacionalidad(nacionalidad){
    validarCampoObligatorio(nacionalidad);
        validarTamano(nacionalidad);

}
function validarIdentificacion(identificacion){
validarSelect(identificacion);
}

function validarNIdentifiacion(nIdentificacion){
    validarCampoObligatorio(nIdentificacion);
        validarTamano(nIdentificacion);

}

function validarEstadoCivil(estadoCivil){
    validarSelect(estadoCivil);
}

function validarTelefonoMovil(tlfmovil){
    validarCampoObligatorio(tlfmovil);
    validarTamanoTelefono(tlfmovil);

}
function validarTelefonoFijo(tlffijo){
    validarCampoObligatorio(tlffijo);
    validarTamanoTelefono(tlffijo);
}
function validarEmail(email){
    validarCampoObligatorio(email);
    validarTamano(email);

}
function validarLinkedin(linkedin){
    validarCampoObligatorio(linkedin);
    validarTamano(linkedin);
}
function validarTwitter(twitter){
    validarCampoObligatorio(twitter);
    validarTamano(twitter);
}
function validarWeb(web){
    validarCampoObligatorio(web);
    validarTamano(web);
}


function setError (element, message){
        element.classList.add('has-error');
        const error = document.createElement('span');
        error.classList.add('text-danger');
        error.innerText = message;
        element.parentNode.appendChild(error);
        element.parentNode.classList.add('has-error');
}

function validarCampoObligatorio(element){

    const elementValue = element.value.trim();
    var msgError = '';

    if(elementValue === '' ){
        msgError = element.id + ' es obligatorio';
        setError(element, msgError);
        
    }
}

function validarSelect(element){
    const elementValue = element.value.trim();
    var msgError = '';

    if(elementValue === '0' ){
        msgError = element.id + ' es obligatorio';
        setError(element, msgError);
        
    }
}

function validarTamano(element){
const elementValue = element.value.trim();
    var msgError = '';

    if(elementValue.length > 0 && elementValue.length <= 2 ){
        msgError = element.id + ' no cumple con los caracteres minimos';
        setError(element, msgError);
        
    }}
   
    function validarTamanoTelefono(element){
const elementValue = element.value.trim();
    var msgError = '';

    if(elementValue.length > 0 && elementValue.length < 9 ){
        msgError = element.id + ' no cumple con los caracteres minimos';
        setError(element, msgError);
        
    }}