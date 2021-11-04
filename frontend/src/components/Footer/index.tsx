function Footer() {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a href="https://github.com/lheanndroaluno" target="_blank" rel="noreferrer">Leandro Amorim</a></p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br />
                    Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
            </div>
        </footer>
    );
}

/**outra forma de declarar uma função javascript */
const Footer2 = () => {
    return (
        <div>
            <h2 className="text-primary">Arfax Tecnologia</h2>
        </div>
    );
}

export default Footer;