let pswControl = document.forms['certificacao']['password'];
let cpfControl = document.forms['certificacao']['cpf'];
// let lgnControl = document.forms['certificacao']['login'];
// let cadControl = document.forms['certificacao']['cadastro'];

// validações do campo de cpf
cpfControl.addEventListener('focusin', () => {
    cpfControl.maxLength = 14;
    cpfControl.minLength = 11;
    cpfControl.required = true;
})

// validação do número do CPF
cpfControl.addEventListener('keyup', () => {
    cpfControl.value = cpfControl.value.replace(/[^\d]+/g,'');
    let value = cpfControl.value;
    if (validaCPF(value)) {
        cpfControl.setCustomValidity('');
        document.querySelector('.error.cpf').style.setProperty('visibility', 'hidden');
        cpfControl.className = 'valid';
    } else {
        cpfControl.setCustomValidity('Ops! CPF inválido. Verifique se seu CPF está correto antes de continuar.');
        cpfControl.className = 'invalid';
    }
})

cpfControl.addEventListener('focusout', () => {
    if (cpfControl.className == 'invalid') {
        document.querySelector('.error.cpf').style.setProperty('visibility', 'visible');
    }
})

function validaCPF(cpf) {
    if (cpf === '00000000000' ||
        cpf === '11111111111' ||
        cpf === '22222222222' ||
        cpf === '33333333333' ||
        cpf === '44444444444' ||
        cpf === '55555555555' ||
        cpf === '66666666666' ||
        cpf === '77777777777' ||
        cpf === '88888888888' ||
        cpf === '99999999999' ||
        Number.parseInt(cpf) == 0 ||
        cpf.length > 11) {
        return false;
    } else if (verificaPrimeiroDigito(cpf) && verificaSegundoDigito(cpf)) {
        return true;
    } else {
        return false;
    }
}

function verificarDigitos(n) {
    return (cpf) => {
        let resto = resta(incrementaNumeros(cpf, n));
        return validacao(resto, cpf, n);
    }
}

let verificaPrimeiroDigito = verificarDigitos(9);
let verificaSegundoDigito = verificarDigitos(10);

function incrementaNumeros(cpf, n) {
    let soma = 0;
    // distribuir os 9 ou 10 primeiros dígitos do CPF;
    // multiplicar cada um pelos números decrescentes de 10 à 2 ou 11 à 2;
    for (let i = 0; i < n; i++) {
        soma += parseInt(cpf.substring(i, i + 1) * ((n + 1) - i));
    }
    return soma;
}

function resta(soma) {
    let resto = 0;
    // resto do valor encontrado multiplicado por 10 e dividido por 11;
    resto = (soma * 10) % 11;
    if (resto == 10 || resto == 11) {
        // se resto da divisão for igual a 10 ou 11 considero 0;
        resto = 0;
    }
    return resto;
}

function validacao(resto, cpf, n) {
    // verificar a igualdade com os dígitos verificadores;
    if (resto == cpf.substring(n, ++n)) {
        return true;
    } else {
        return false;
    }
}

// validações do campo de senha:
pswControl.addEventListener('focusin', () => {
    // validações para o campo senha só quando ele recebe foco
    pswControl.minLength = 6;
    pswControl.required = true;
})

pswControl.addEventListener('focusout', () => {
    // mensagem de erro caso a senha seja muito curta
    let errorMsg = document.querySelector('.error.password');
    if (pswControl.validity.tooShort) {
        errorMsg.style.setProperty('visibility', 'visible');
    }
})

pswControl.addEventListener('keyup', () => {
    // retira a mensagem de erro assim que validar
    let errorMsg = document.querySelector('.error.password');
    if (!pswControl.validity.tooShort) {
        errorMsg.style.setProperty('visibility', 'hidden');
    }
})



// testes do validador de CPF
function testes() {
    teste('CPF inválido (números repetidos)', '22222222222');
    teste('CPF inválido', '07453156689');
    teste('CPF válido', '16135647830');
}

function teste(testName, cpf) {
    console.group(`${testName}:`)
    if (validaCPF(cpf)) {
        document.forms['certificacao']['cpf'].className = 'valid';
    } else {
        document.forms['certificacao']['cpf'].className = 'invalid';
    }
    let x = document.forms['certificacao']['cpf'].className
    console.log(x)
    if (x === 'valid') {
        console.log('CPF válido')
    } else {
        console.log('CPF inválido')
    }
    console.groupEnd()
}

// testes()