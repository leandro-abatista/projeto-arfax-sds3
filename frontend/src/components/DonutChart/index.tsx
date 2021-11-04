import Charts from "react-apexcharts";

function DonutChart() {

    const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Charts
            /**parâmetros */
            options={{ ...options, labels: mockData.labels }}
            series={mockData.series}
            type="donut"/**tipo do gráfico */
            height="240"/**altura do gráfico */
        />
    );
}

export default DonutChart;